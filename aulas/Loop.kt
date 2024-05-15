package br.com.kotlin.aulas

import java.math.BigDecimal

fun main() {
    val precoDosProdutos: Array<BigDecimal> = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    // for

    var precoTotal = BigDecimal.ZERO

    for (preco in precoDosProdutos) {
        precoTotal += preco
    }

    println("Valor total = $precoTotal")

    // while

    var contador = 0
    precoTotal = BigDecimal.ZERO

    while (contador < precoDosProdutos.size) {
        precoTotal += precoDosProdutos[contador]
        contador += 1
    }

    println("Valor total = $precoTotal")

    // do while

    contador = 0
    precoTotal = BigDecimal.ZERO

    do {
        precoTotal += precoDosProdutos[contador]
        contador += 1
    } while (contador < precoDosProdutos.size)

    println("Valor total = $precoTotal")
}