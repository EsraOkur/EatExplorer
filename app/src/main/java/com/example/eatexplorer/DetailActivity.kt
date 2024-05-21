package com.example.eatexplorer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    private lateinit var cityName : String
    private lateinit var image : ImageView
    private lateinit var text : TextView
    private lateinit var image2 : ImageView
    private lateinit var text2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        cityName = ""
        image = findViewById(R.id.detailImageView)
        text = findViewById(R.id.detailTextView)
        image2 = findViewById(R.id.detailImageView2)
        text2 = findViewById(R.id.detailTextView2)
        if (intent.hasExtra("cityname")) {
            cityName = intent.getStringExtra("cityname")!!
        }

        if(cityName.equals("Antalya")) {
            image.setBackgroundResource(R.drawable.civee)
            text.setText("Cive is a traditional meat dish specific to Antalya cuisine. It is usually prepared using lamb or beef. The meat is cooked with onion, green pepper, tomato, and spices. The prepared cive is typically served with rice or bulgur pilaf. Prepared by marinating the meat with special spices, cive is a rich and satisfying dish. An essential part of Antalya's traditional flavors, cive offers a unique taste of the region and is often preferred for special occasions or gatherings.")

            image2.setBackgroundResource(R.drawable.hibess)

            text2.setText("Hibes is a beloved appetizer in Antalya cuisine. It is usually a type of puree made with dry beans or chickpeas. Dry beans or chickpeas are boiled and mashed, then mixed with garlic, lemon juice, tahini, olive oil, and spices. The prepared hibes is typically served with bread or lavash. With its rich protein content, hibes is both a healthy and delicious option. It is a frequently consumed and beloved variety of appetizer in Antalya.")
        }
        if(cityName.equals("Aydın")) {
            image.setBackgroundResource(R.drawable.ayranboregi)
            text.setText("Ayran Böregi is a popular pastry in Aydın cuisine. It is prepared by layering thin sheets of pastry with a mixture of cheese, parsley, and yogurt. This mixture creates a light texture and enhances the flavor of the pastry. Once prepared, the pastry is usually arranged on a baking sheet and baked with butter brushed on top. After baking, it is served hot or warm. Ayran Böregi offers a light and flavorful taste with its yogurt and cheese filling. It is often enjoyed during breakfast or tea time. Ayran Böregi, one of the regional delicacies of Aydın, is a special dessert that you can offer to your guests or family.")

            image2.setBackgroundResource(R.drawable.cinekoftesi)

            text2.setText("Cine Köfte is a traditional meatball dish specific to Aydın province. This köfte is made by combining bulgur, finely chopped red meat (usually lamb or beef), onion, spices, and parsley. Among the spices added are cumin, red pepper, black pepper, and allspice. The most distinctive feature of Cine Köfte is its long and cylindrical shape. The prepared meatball mixture is firmly shaped into long cylinders. Then, finely chopped parsley is sprinkled on top for serving. Cine Köfte is usually sautéed or fried in its own fat. It is served with fresh greens, tomato slices, pickles, and bread as garnishes. Cine Köfte, with its unique flavor and preparation, is an important dish of Aydın known and loved by both locals and visitors.")
        }
        if(cityName.equals("Balıkesir")) {
            image.setBackgroundResource(R.drawable.hosmerimm)
            text.setText("Hösmerim is one of the unique flavors of Balıkesir cuisine. It is prepared with simple ingredients such as milk, flour, and sugar. Firstly, milk is boiled, then flour is added and stirred until thickened. Then, sugar is added and cooked until the mixture reaches a homogeneous consistency. The cooked mixture is usually cut into square or rectangular shapes, topped with plenty of powdered pistachios, and served sliced.")

            image2.setBackgroundResource(R.drawable.tiritt)

            text2.setText("Tirit is a popular meat dish in Balıkesir cuisine. It is usually prepared using lamb or beef. Tirit is made by pouring meat and meat broth over bread slices that have been boiled in broth. Then, it is served with yogurt and butter on top. Tirit is often enriched with spices and served hot. An essential dish of Balıkesir's traditional cuisine, tirit is a nutritious and delicious meal, especially favored on cold winter days.")
        }
        if(cityName.equals("Kayseri")) {
            image.setBackgroundResource(R.drawable.manti)
            text.setText("Manti is one of the most beloved and well-known dishes of Turkish cuisine. It is prepared by placing a mixture of minced meat, onion, and spices inside thin dough. Kayseri mantı, unlike other types of mantı, is usually smaller in size and can often be triangular in shape. Mantı is typically served with a special yogurt and garlic sauce. It is also seasoned with butter and a sauce made from red pepper. Mantı is an indispensable part of Kayseri cuisine and is often preferred for special occasions or when hosting guests.")

            image2.setBackgroundResource(R.drawable.nevzine)

            text2.setText("Nevzine Dessert is an important dessert of Kayseri cuisine, especially preferred during Ramadan and special occasions. Nevzine is a kind of sweet dough prepared by mixing chopped walnuts, sugar, flour, molasses, and water. This dough is first roasted in oil and then cut into small pieces. The desserts are decorated with traditional patterns. Once cooled, they are combined with syrup. The syrup can be a simple one made by boiling sugar and water or the Nevzine molasses unique to Kayseri, known for its specific taste.")
        }
        if(cityName.equals("Manisa")) {
            image.setBackgroundResource(R.drawable.sura)
            text.setText("Sura dish is a traditional meal usually prepared with lamb meat and rice. Sura is made using lamb meat parts such as ribs or forearms. This dish is typically preferred on large dining tables and is prepared traditionally.\n" +
                    "The preparation of Sura is quite simple. Firstly, lamb meat is cooked in a large pot or cauldron. The meat is cooked over low heat until it releases its juices and becomes tender. Then, rice ingredients are added on top of the meat. This usually includes rice, finely chopped vegetables, and spices. The rice is cooked together with the meat's juices and flavor, allowing the meat's aroma to infuse into the rice.\n" +
                    "Sura is typically served on a large tray or serving platter. This dish is known to be a popular main course choice, especially at gatherings or large family meals.\n" +
                    "The characteristic feature of Sura is the delicious harmony between the tenderness of the lamb meat and the rice.\n")

            image2.setBackgroundResource(R.drawable.manisakebabi)

            text2.setText("Manisa kebab, a traditional dish specific to the Manisa province in Turkish cuisine, holds a special place. This kebab is usually made from lamb meat and stands out with its unique cooking method.\n" +
                    "The preparation of Manisa kebab requires great care. Thinly sliced lamb meat is typically skewered and cooked over special charcoal made from wood. It's essential for the wood charcoal to burn properly during cooking to bring out the flavors characteristic of the meat.\n" +
                    "The taste of Manisa kebab is closely related to the careful selection of meat and the cooking method. Throughout the cooking process, the meat is kept juicy and tender, resulting in a delicious and satisfying kebab.\n" +
                    "Manisa kebab is often served with lavash or bread and commonly accompanied by onions, tomatoes, and greens as garnish. Additionally, side dishes like rice pilaf with yogurt or tomato sauce may be served alongside the kebab. Manisa kebab is a rich part of Turkish cuisine and is often presented as a special delicacy at gatherings, celebrations, or in restaurants.\n")
        }

    }
}