package br.com.kotlin.poo.encapsulamento

import java.math.BigDecimal

class Calculadora {
    private var resultado: BigDecimal = BigDecimal.ZERO

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

    fun mostrarResultado() {
        println("O resultado é $resultado")
    }
}