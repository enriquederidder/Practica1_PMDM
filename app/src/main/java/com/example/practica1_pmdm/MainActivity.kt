package com.example.practica1_pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var contador:Int=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        contador++;
        Log.i("ESTADOS","Creando la actividad:"+contador)
        Log.i("ESTADOS","Evento onCreate:"+contador)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        contador++;
        Log.i("ESTADOS","Evento onStart:"+contador)
    }
    override fun onResume() {
        super.onResume()
        contador++;
        Log.i("ESTADOS","Evento onResume:"+contador)
    }
    override fun onStop() {
        super.onStop()
        contador++;
        Log.i("ESTADOS","Evento onStop:"+contador)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("ESTADOS","Evento onDestroy:"+contador)
    }
}