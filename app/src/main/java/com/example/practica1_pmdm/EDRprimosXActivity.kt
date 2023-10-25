package com.example.practica1_pmdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EDRprimosXActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edr_primos_xactivity)
        var numero = intent.getIntExtra("numero", -1)
        var resultadoPrimo = cal_primos(numero)

        val returnIntent = Intent()
        returnIntent.putExtra("Resultado", resultadoPrimo.toString())
        setResult(RESULT_OK, returnIntent)
        finish()
    }

    fun cal_primos(n: Int): ArrayList<Int> {
        val elementos = ArrayList<Int>()

        for (i in 1..n) {
            if (esPrimo(i, i - 1)) {
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