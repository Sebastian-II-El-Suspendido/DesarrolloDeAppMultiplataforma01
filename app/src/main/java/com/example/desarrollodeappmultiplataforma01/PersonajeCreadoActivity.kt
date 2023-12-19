package com.example.desarrollodeappmultiplataforma01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class PersonajeCreadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personaje_creado)
        val NombrePersonaje: TextView = findViewById(R.id.NombrePersonaje)
        val RazaPersonaje: TextView = findViewById(R.id.RazaPersonaje)
        val ClasePersonaje: TextView = findViewById(R.id.ClasePersonaje)
        val EstadoVitalPersonaje: TextView = findViewById(R.id.EstadoVitalPersonaje)

        val personaje = intent.getSerializableExtra("personaje") as Personaje
        NombrePersonaje.text = personaje.getNombre()
        RazaPersonaje.text = personaje.getRaza().toString()
        ClasePersonaje.text = personaje.getClase().toString()
        EstadoVitalPersonaje.text = personaje.getEstadoVital().toString()
    }
}