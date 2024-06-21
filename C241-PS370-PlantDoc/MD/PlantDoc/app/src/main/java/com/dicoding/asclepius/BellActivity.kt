package com.dicoding.asclepius

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class BellActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)


        // Set content specific to Stock Market
        imageView.setImageResource(R.drawable.bell) // Replace with actual image resource
        titleTextView.text = "Bell Papper"
        descriptionTextView.text = "The bell pepper (also known as sweet pepper, pepper, capsicum /ˈkæpsɪkəm/[1] or in " +
                "some places, mangoes) is the fruit of plants in the Grossum Group of the species "+
                "Capsicum annuum. Cultivars of the plant produce fruits in different colors, including red," +
                "yellow, orange, green, white, chocolate, candy cane striped, and purple. Bell peppers are " +
                "sometimes grouped with less pungent chili varieties as \"sweet peppers\". While they are" +
                "botanically fruits—classified as berries—they are commonly used as a vegetable " +
                "ingredient or side dish. Other varieties of the genus Capsicum are categorized as chili " +
                "peppers when they are cultivated for their pungency, including some varieties of " +
                "Capsicum annuum."+"Peppers are native to Mexico, Central America, the Caribbean and northern South " +
                "America. Pepper seeds were imported to Spain in 1493 and then spread through Europe " +
                "and Asia. The mild bell pepper cultivar was developed in the 1920s, in Szeged, Hungary. " +
                "Preferred growing conditions for bell peppers include warm, moist soil in a temperature " +
                "range of 21 to 29 °C (70 to 84 °F). "


        findViewById<Button>(R.id.actionButton1).setOnClickListener {
            val intent = Intent(this, DisActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.actionButton2).setOnClickListener {
            finish()
        }
    }
}