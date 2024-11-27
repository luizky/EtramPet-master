package br.unipar.at2final

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val btnRegistrarPet = findViewById<Button>(R.id.btnRegistrarPet)

        btnRegistrarPet.setOnClickListener {
            val intent = Intent(this, Tela3Activity::class.java)
            startActivity(intent)
        }
    }
}
