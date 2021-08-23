package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var x = 10 // var é mutável
        //x = 9

        //val x = 20 // val é imutável
        //x = 17

        val buttonCalcular =
            findViewById<Button>(R.id.button_calcular)

        val editTextPeso =
            findViewById<EditText>(R.id.edit_text_peso)

        //val ediTextPesoConteudo = editTextPeso.text.toString().trim()

        val editTextAltura =
            findViewById<EditText>(R.id.edit_text_altura)

        //val ediTextAlturaConteudo = editTextAltura.text.toString().trim()

        val textViewResultado =
            findViewById<TextView>(R.id.text_view_resultado)

//        val textViewStatus =
//            findViewById<TextView>(R.id.text_view_status)

        buttonCalcular.setOnClickListener {
            if (editTextAltura.text.isEmpty() || editTextPeso.text.isEmpty()) {
                val text = "Preencha todos os campos!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            } else {
                textViewResultado.text = calcularImc(
                    editTextPeso.text.toString().toInt(),
                    editTextAltura.text.toString().toDouble()
                ).toString()
            }
        }

    }
}
