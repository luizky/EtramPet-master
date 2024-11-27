package br.unipar.at2final
import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tela3Activity : AppCompatActivity() {

    private val LOCATION_PERMISSION_REQUEST_CODE = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        checkLocationPermission()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewViagens)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val viagens = listOf(
            Viagem("Viagem 1"),
            Viagem("Viagem 2"),
            Viagem("Viagem 3"),
            Viagem("Viagem 4"),
            Viagem("Viagem 5"),
            Viagem("Viagem 6")
        )

        recyclerView.adapter = ViagemAdapter(viagens)
    }

    private fun checkLocationPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                LOCATION_PERMISSION_REQUEST_CODE
            )
        } else {
            Toast.makeText(this, "Permissão de GPS concedida", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permissão de GPS concedida", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Permissão de GPS negada", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
