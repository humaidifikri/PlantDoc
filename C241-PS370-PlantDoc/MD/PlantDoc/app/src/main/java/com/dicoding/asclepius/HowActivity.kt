package com.dicoding.asclepius

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class HowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutor)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)


        // Set content specific to Stock Market
        imageView.setImageResource(R.drawable.group1708) // Replace with actual image resource
        titleTextView.text = "Tutorial"
        descriptionTextView.text = "1. Open the scan feature in the app, located at the bottom center of the screen, then select an image from your gallery to start the plant disease identification process.\n" +
                "\n" +
                "2. Press the analyze button at the bottom of the screen.\n" +
                "\n" +
                "3. You will be directed to a page displaying the results of the disease identification.\n" +
                "\n" +
                "4. To find out the correct treatment and medication for managing the disease, you can return to the main page and search for the name of your plant disease in the 'categories' section. There are three options for plants listed; choose the species of your plant, and you will be directed to a page that provides basic knowledge about the searched plant.\n" +
                "\n" +
                "5. You will find the name of the plant disease you searched for at the bottom of the page.\n" +
                "\n" +
                "6. Simply tap on the name of the disease, and the appropriate treatment and medication will appear on the displayed page."



        findViewById<Button>(R.id.actionButton2).setOnClickListener {
            finish()
        }
    }
}