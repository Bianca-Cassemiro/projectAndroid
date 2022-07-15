package com.example.myapplication


import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textJames: TextView = findViewById(R.id.textTop)
        var buttonC = findViewById<Button>(R.id.button)
        var imageCarina = findViewById<ImageView>(R.id.imageCarina)
        var uri = "@drawable/_5712498"

        buttonC.setOnClickListener{

            textJames.setText("Quinteto de Stephan, grupo de cinco galáxias que fica na constelação de Pegasus, a cerca de 290 milhões anos-luz da Terra")
            buttonC.text = "Legal né"
            val image = resources.getDrawable(R.drawable._5712498)

           imageCarina.setImageDrawable(image)

        }

    }
}