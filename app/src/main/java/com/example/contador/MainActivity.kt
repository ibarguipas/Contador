package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var contador: Int = 0
    private lateinit var contadorTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contadorTxt = findViewById(R.id.contador) // Move this line here

        val incrementarButton: Button = findViewById(R.id.buttonPlus)
        val decrementarButton: Button = findViewById(R.id.buttonMinus)
        val restart: ImageButton = findViewById(R.id.imageButton)

        incrementarButton.setOnClickListener {
            incrementar()
        }
        decrementarButton.setOnClickListener {
            decrementar()
        }
        restart.setOnClickListener {
            restart()
        }
    }

    fun incrementar() {
        contador++
        contadorTxt.text = contador.toString()
    }

    fun decrementar() {
        if (contador > 0) {
            contador--
            contadorTxt.text = contador.toString()
        }
    }

    fun restart() {
        contador = 0
        contadorTxt.text = contador.toString()
    }
}
