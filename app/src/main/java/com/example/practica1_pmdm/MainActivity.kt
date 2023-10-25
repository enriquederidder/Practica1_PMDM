package com.example.practica1_pmdm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var EDR:Int=0;
    var contador:Int=0;
    lateinit var buttonReturn: Button
    lateinit var buttonIraActivityPrimos: Button

       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EDR = 0;
        contador++;
        Log.i("ESTADOS","Creando actividad:"+contador)
        Log.i("ESTADOS","Evento onCreate:"+contador)
        setContentView(R.layout.activity_edr_primos)

           buttonReturn = findViewById(R.id.buttonReturn)

           buttonReturn.setOnClickListener {
           val intent = Intent(this,EDR_primosActivity::class.java)
           intent.putExtra("numero",36)
           startActivityForResult(intent,1)

       }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var resultado = data?.getStringExtra("Resultado")
        Log.i("Resultado", resultado!!)

    }
    override fun onStart() {
        super.onStart()
        contador++;
        EDR++;
        Log.i("ESTADOS","Evento onStart:"+contador)
    }
    override fun onResume() {
        super.onResume()
        contador++;
        EDR++;
        Log.i("ESTADOS","Evento onResume:"+contador)
    }
    override fun onStop() {
        super.onStop()
        contador++;
        EDR++;
        Log.i("ESTADOS","Evento onStop:"+contador)
    }
    override fun onDestroy() {
        super.onDestroy()
        EDR++;
        Log.i("ESTADOS","Evento onDestroy:"+contador)
    }
}