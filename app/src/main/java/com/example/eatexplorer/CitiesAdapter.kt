package com.example.eatexplorer

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CitiesAdapter (private val mContext: Context, private val citiesList: List<Cities>) : RecyclerView.Adapter<CitiesAdapter.CardViewDesignObjectHolder>() {

    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var seriesCardView: CardView
        var cardImage: ImageView
        var cardtext: TextView
        init {
            seriesCardView = view.findViewById(R.id.citiesCardView)
            cardImage = view.findViewById(R.id.cities_card_image)
            cardtext = view.findViewById(R.id.cardtext)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.cities_cardview,parent,false)
        return  CardViewDesignObjectHolder(design)
    }



    override fun getItemCount(): Int {
        return citiesList.size
    }

    override fun onBindViewHolder(
        holder: CitiesAdapter.CardViewDesignObjectHolder,
        position: Int
    ) {
        val cities = citiesList[position]
        holder.cardtext.setText(cities.name)
        if (cities.name=="Antalya") {
            holder.cardImage.setBackgroundResource(R.drawable.civee)


        }
        else if (cities.name=="Aydın") {
            holder.cardImage.setBackgroundResource(R.drawable.cinekoftesi)

        }
        if (cities.name.equals("Balıkesir")) {
            holder.cardImage.setBackgroundResource(R.drawable.tiritt)

        }
        if (cities.name=="Kayseri") {
            holder.cardImage.setBackgroundResource(R.drawable.manti)

        }
        if (cities.name=="Manisa") {
            holder.cardImage.setBackgroundResource(R.drawable.sura)

        }
        holder.seriesCardView.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, DetailActivity::class.java)
            intent.putExtra("cityname", cities.name)
            mContext.startActivity(intent)
        })
    }
}