package com.dicoding.asclepius

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class DisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penyakitl)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)
        val solutionTextView = findViewById<TextView>(R.id.solutionTextView)


        // Set content specific to Stock Market
        imageView.setImageResource(R.drawable.bell) // Replace with actual image resource
        titleTextView.text = "Bell Papper"
        descriptionTextView.text = "Xanthomonas campestris pv. vesicatoria is a bacterium that causes bacterial leaf spot (BLS) on peppers and tomatoes. It is a gram-negative and rod-shaped. It causes symptoms throughout the above-ground portion of the plant including leaf spots, fruit spots and stem cankers. Since this bacterium cannot live in soil for more than a few weeks and survives as inoculum on plant debris, removal of dead plant material and chemical applications to living plants are considered effective control mechanisms."
        solutionTextView.text = "Effective management of Xanthomonas campestris pv. vesicatoria, the bacterium responsible for bacterial spot disease in tomatoes and peppers, involves several key practices. First, it is crucial to practice thorough sanitation by promptly removing and destroying infected plants to prevent further spread of the bacteria. Regular cleaning and disinfection of agricultural tools and equipment help minimize cross-contamination. Implementing crop rotation with non-solanaceous plants can reduce bacterial populations in the soil. Opting for drip irrigation over overhead watering helps minimize leaf moisture, which can otherwise facilitate bacterial spread. Lastly, planting resistant tomato and pepper varieties is essential to mitigate the impact of the disease. These integrated approaches contribute to effective management and control of bacterial spot disease, preserving the health and productivity of tomato and pepper crops.\n\n\n"+ "For treating Xanthomonas campestris pv. vesicatoria, copper-based bactericides such as copper hydroxide or copper oxychloride are recommended. These compounds effectively reduce bacterial populations on plants when applied according to label instructions. Copper-based treatments should be applied regularly and adjusted based on weather conditions and the severity of infection to achieve optimal results. Additionally, biopesticides containing Bacillus subtilis or Bacillus amyloliquefaciens can be used as biological controls, inhibiting bacterial growth and providing an alternative or complementary treatment method to conventional bactericides. Integrated use of these treatments helps to manage bacterial spot disease in tomatoes and peppers effectively, ensuring healthier and more productive crops."


        findViewById<Button>(R.id.actionButton2).setOnClickListener {
            finish()
        }
    }
}