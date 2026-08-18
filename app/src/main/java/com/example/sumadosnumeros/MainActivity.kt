package com.example.sumadosnumeros

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumero1: EditText
    private lateinit var edtNumero2: EditText
    private lateinit var btnSumar: Button
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        edtNumero1 = findViewById(R.id.edtNumero1)
        edtNumero2 = findViewById(R.id.edtNumero2)
        btnSumar = findViewById(R.id.btnsumar)
        txtResultado = findViewById(R.id.txtResultado)

        btnSumar.setOnClickListener {
            val num1 = edtNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = edtNumero2.text.toString().toIntOrNull() ?: 0

            val resultado = sumar(num1, num2)

            txtResultado.text = "Resultado: $resultado"
        }
    }

    private fun sumar(numero1: Int, numero2: Int): Int {
        return numero1 + numero2
    }
}