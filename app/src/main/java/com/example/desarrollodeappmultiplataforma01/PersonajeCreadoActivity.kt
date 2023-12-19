package com.example.desarrollodeappmultiplataforma01

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class PersonajeCreadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personaje_creado)
        val imagen : ImageView = findViewById(R.id.imageView)
        val NombrePersonaje: TextView = findViewById(R.id.NombrePersonaje)
        val RazaPersonaje: TextView = findViewById(R.id.RazaPersonaje)
        val ClasePersonaje: TextView = findViewById(R.id.ClasePersonaje)
        val EstadoVitalPersonaje: TextView = findViewById(R.id.EstadoVitalPersonaje)
        val btnAtras : Button = findViewById(R.id.buttonAtras)
        val btnSiguiente : Button = findViewById(R.id.buttonSiguiente)

        val personaje = intent.getSerializableExtra("personaje") as Personaje
        val raza = personaje.getRaza().toString()
        val clase = personaje.getClase().toString()
        val estado = personaje.getEstadoVital().toString()
        NombrePersonaje.text = personaje.getNombre().uppercase()
        RazaPersonaje.text = raza
        ClasePersonaje.text = clase
        EstadoVitalPersonaje.text = estado

        val imagend = when ("${clase.lowercase()}_${raza.lowercase()}_${estado.lowercase()}"){
            "brujo_humano_anciano" -> R.drawable.brujo_humano_anciano
            "brujo_humano_adulto" -> R.drawable.brujo_humano_adulto
            "brujo_humano_joven" -> R.drawable.brujo_humano_joven
            "brujo_elfo_anciano" -> R.drawable.brujo_elfo_anciano
            "brujo_elfo_adulto" -> R.drawable.brujo_elfo_adulto
            "brujo_elfo_joven" -> R.drawable.brujo_elfo_joven
            "brujo_enano_anciano" -> R.drawable.brujo_enano_anciano
            "brujo_enano_adulto" -> R.drawable.brujo_enano_adulto
            "brujo_enano_joven" -> R.drawable.brujo_enano_joven
            "brujo_madito_anciano" -> R.drawable.brujo_maldito_anciano
            "brujo_madito_adulto" -> R.drawable.brujo_maldito_adulto
            "brujo_madito_joven" -> R.drawable.brujo_maldito_joven
            "mago_humano_anciano" -> R.drawable.mago_humano_anciano
            "mago_humano_adulto" -> R.drawable.mago_humano_adulto
            "mago_humano_joven" -> R.drawable.mago_humano_joven
            "mago_elfo_anciano" -> R.drawable.mago_elfo_anciano
            "mago_elfo_adulto" -> R.drawable.mago_elfo_adulto
            "mago_elfo_joven" -> R.drawable.mago_elfo_joven
            "mago_enano_anciano" -> R.drawable.mago_enano_anciano
            "mago_enano_adulto" -> R.drawable.mago_enano_adulto
            "mago_enano_joven" -> R.drawable.mago_enano_joven
            "mago_madito_anciano" -> R.drawable.mago_maldito_anciano
            "mago_madito_adulto" -> R.drawable.mago_maldito_adulto
            "mago_madito_joven" -> R.drawable.mago_maldito_joven
            "guerrero_humano_anciano" -> R.drawable.guerrero_humano_anciano
            "guerrero_humano_adulto" -> R.drawable.guerrero_humano_adulto
            "guerrero_humano_joven" -> R.drawable.guerrero_humano_joven
            "guerrero_elfo_anciano" -> R.drawable.guerrero_elfo_anciano
            "guerrero_elfo_adulto" -> R.drawable.guerrero_elfo_adulto
            "guerrero_elfo_joven" -> R.drawable.guerrero_elfo_joven
            "guerrero_enano_anciano" -> R.drawable.guerrero_enano_anciano
            "guerrero_enano_adulto" -> R.drawable.guerrero_enano_adulto
            "guerrero_enano_joven" -> R.drawable.guerrero_enano_joven
            "guerrero_madito_anciano" -> R.drawable.guerrero_maldito_anciano
            "guerrero_madito_adulto" -> R.drawable.guerrero_maldito_adulto
            "guerrero_madito_joven" -> R.drawable.guerrero_maldito_joven
            else -> {R.drawable.default_humano_adulto}
        }
        imagen.setImageResource(imagend)

        btnAtras.setOnClickListener {
            intent = Intent(this@PersonajeCreadoActivity, MainActivity::class.java)
            startActivity(intent)
        }

        btnSiguiente.setOnClickListener {
            intent = Intent(this@PersonajeCreadoActivity, PantallaExtraActivity::class.java)
            startActivity(intent)
        }
    }
}