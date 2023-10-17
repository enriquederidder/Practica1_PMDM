package com.example.practica1_pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var EDR:Int=0;
    var contador:Int=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EDR = 0;
        contador++;
        Log.i("ESTADOS","Creando la actividad:"+contador)
        Log.i("ESTADOS","Evento onCreate:"+contador)
        setContentView(R.layout.activity_main)
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