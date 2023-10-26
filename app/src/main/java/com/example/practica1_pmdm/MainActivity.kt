package com.example.practica1_pmdm

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var EDR: Int = 0
    var contador: Int = 0
    lateinit var buttonReturn: Button
    lateinit var buttonIraActivityPrimos: Button
    lateinit var buttonReturnX: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EDR = 0
        contador++
        Log.i("ESTADOS", "Creando actividad:" + contador)
        Log.i("ESTADOS", "Evento onCreate:" + contador)

        buttonReturn = findViewById(R.id.buttonReturn)
        buttonReturn.setOnClickListener {
            val intent = Intent(this, EDR_primosActivity::class.java)
            intent.putExtra("numero", 36)
            startActivityForResult(intent, 1)
        }

        buttonReturnX = findViewById(R.id.buttonReturnX)

        buttonReturnX.setOnClickListener {
            val intent = Intent(this, EDRprimosXActivity::class.java)
            intent.putExtra("numero", 5)
            edrPrimosResultLauncher.launch(intent)
        }
    }

    private val edrPrimosResultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            val data: Intent? = result.data
            val resultado = data?.getStringExtra("Resultado")
            Log.i("Resultado", resultado!!)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == RESULT_OK) {
            val resultado = data?.getStringExtra("Resultado")
            Log.i("Resultado", resultado!!)
        }
    }

    override fun onStart() {
        super.onStart()
        contador++
        EDR++
        Log.i("ESTADOS", "Evento onStart:" + contador)
    }

    override fun onResume() {
        super.onResume()
        contador++
        EDR++
        Log.i("ESTADOS", "Evento onResume:" + contador)
    }

    override fun onStop() {
        super.onStop()
        contador++
        EDR++
        Log.i("ESTADOS", "Evento onStop:" + contador)
    }

    override fun onDestroy() {
        super.onDestroy()
        EDR++
        Log.i("ESTADOS", "Evento onDestroy:" + contador)
    }
}