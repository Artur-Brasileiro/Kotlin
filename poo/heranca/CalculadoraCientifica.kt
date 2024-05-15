package br.com.kotlin.poo.heranca

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class CalculadoraCientifica: Calculadora() {

    fun potencia(a: Int) {
        resultado = resultado.pow(a, MathContext(0, RoundingMode.HALF_UP))
        mostrarResultado()
    }
}