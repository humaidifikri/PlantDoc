package com.dicoding.asclepius

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class TomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)


        // Set content specific to Currency Market
        imageView.setImageResource(R.drawable.tom) // Replace with actual image resource
        titleTextView.text = "Tomato"
        descriptionTextView.text = "The potato (/pəˈteɪtoʊ/) is a starchy root vegetable native to the Americas, consumed " +
                "globally as a staple food. It is a tuber of Solanum tuberosum, a perennial in the nightshade " +
                "family Solanaceae. " +
                "Wild potatoes range from the southern U.S. to southern Chile. Genetic studies trace the " +
                "cultivated potato's origin to southern Peru and northwestern Bolivia, domesticated 7,000" +
                "10,000 years ago. Numerous varieties are cultivated in the Andes, where the species is " +
                "indigenous. " +
                "Introduced to Europe by the Spanish in the 16th century, potatoes became a staple food " +
                "worldwide. Over 5,000 varieties exist today due to selective breeding. Europe, especially " +
                "Northern and Eastern regions, has the highest per capita production. The fastest growth " +
                "in production during the 21st century has been in southern and eastern Asia, with China " +
                "and India leading in 2021. " +
                "Potatoes, like tomatoes, belong to the genus Solanum. The aerial parts contain the toxin " +
                "solanine, and improperly stored tubers exposed to light can become toxic."


        findViewById<Button>(R.id.actionButton1).setOnClickListener {
            // Action for button 1
        }

        findViewById<Button>(R.id.actionButton2).setOnClickListener {
            finish()
        }
    }
}