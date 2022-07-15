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
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.button.setOnClickListener{
            binding.textTop.setText("Quinteto de Stephan, grupo de cinco galáxias que fica na constelação de Pegasus, a cerca de 290 milhões anos-luz da Terra")
            binding.button.text = "Legal né"
            val image = resources.getDrawable(R.drawable._5712498)

           binding.imageCarina.setImageDrawable(image)
        }

    }
}