package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  var textJames = findViewById<View>(R.id.textTop)
        var buttonC = findViewById<Button>(R.id.button)

        buttonC.setOnClickListener{
          //  textJames = "Grupo de cinco galáxias que fica na constelação de Pegasus, a cerca de 290 milhões anos-luz da Terra"
        }

    }
}