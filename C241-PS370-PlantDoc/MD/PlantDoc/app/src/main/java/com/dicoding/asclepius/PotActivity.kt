package com.dicoding.asclepius

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class PotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)


        // Set content specific to Currency Market
        imageView.setImageResource(R.drawable.pot) // Replace with actual image resource
        titleTextView.text = "Potato"
        descriptionTextView.text = "The tomato (/təˈmeɪtoʊ/ or /təˈmɑːtoʊ/) is the edible berry of Solanum lycopersicum. " +
                "Originating in western South America, Mexico, and Central America, it was domesticated " +
                "by indigenous peoples of Mexico and used by the Aztecs. The Spanish brought tomatoes " +
                "to Europe after encountering them in the Aztec Empire, leading to their global spread in " +
                "the 16th century. " +
                "Tomatoes are a major source of umami flavor and are consumed raw or cooked in various " +
                "dishes, sauces, salads, and drinks. Although botanically a fruit, they are used as a " +
                "vegetable in cooking. Many varieties are grown worldwide, with greenhouses enabling " +
                "year-round production. Tomato plants typically grow 1-3 meters (3-10 ft) tall and need " +
                "support. Indeterminate plants are perennials in their native habitat but are cultivated as " +
                "annuals, while determinate plants are annuals that produce a crop all at once. Tomato " +
                "sizes vary from 1-10 cm (1⁄2-4 in) depending on the cultivar."


        findViewById<Button>(R.id.actionButton1).setOnClickListener {
            // Action for button 1
        }

        findViewById<Button>(R.id.actionButton2).setOnClickListener {
            finish()
        }
    }
}