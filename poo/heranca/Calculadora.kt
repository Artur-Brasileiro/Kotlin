package br.com.kotlin.poo.heranca

import java.math.BigDecimal

open class Calculadora {
    protected var resultado: BigDecimal = BigDecimal.ZERO

    fun somar(a: BigDecimal) {
        resultado += a
        mostrarResultado()
    }

    fun subtrair(a: BigDecimal) {
        resultado -= a
        mostrarResultado()
    }

    fun multiplicar(a: BigDecimal) {
        resultado *= a
        mostrarResultado()
    }

    fun dividir(a: BigDecimal) {
        resultado = resultado.divide(a)
        mostrarResultado()
    }

    protected fun mostrarResultado() {
        println("O resultado é $resultado")
    }
}