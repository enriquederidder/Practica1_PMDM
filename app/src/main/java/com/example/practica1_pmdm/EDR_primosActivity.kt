package com.example.practica1_pmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EDR_primosActivity : AppCompatActivity() {

    lateinit var botonVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edr_primos)

        botonVolver = findViewById(R.id.buttonReturn)
        botonVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
    fun cal_primos(n:Int):ArrayList<Int>{
        var elementos = ArrayList<Int>()

        for(i in 1  ..  n){
            if(esPrimo(i, i-1)){
                elementos.add(i)
            }
        }

        return elementos
    }
    private fun esPrimo(n: Int, divisor: Int): Boolean {
        if (divisor <= 1) {
            return true
        } else if (n % divisor == 0) {
            return false
        } else {
            return esPrimo(n, divisor - 1)
        }
    }
}