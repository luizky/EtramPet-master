package br.unipar.at2final

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class Tela1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)

        val btnEntrar = findViewById<Button>(R.id.btnEntrar)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        btnEntrar.setOnClickListener {

            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent)
        }

        btnRegistrar.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent)
        }
    }
}
