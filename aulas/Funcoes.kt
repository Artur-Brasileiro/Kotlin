package br.com.kotlin.aulas

import java.math.BigDecimal

fun main() {
    val precoDosProdutos1: Array<BigDecimal> = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    val precoDosProdutos2: Array<BigDecimal> = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    val precoDosProdutos3: Array<BigDecimal> = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    val precoProduto1 = somarPrecos(precoDosProdutos1)
    println("Valor total lista 1 = $precoProduto1")

    val precoProduto2 = somarPrecos(precoDosProdutos2)
    println("Valor total lista 2 = $precoProduto2")

    val precoProduto3 = somarPrecos(precoDosProdutos3)
    println("Valor total lista 3 = $precoProduto3")
}

fun somarPrecos(produtos: Array<BigDecimal>): BigDecimal {
    var precoTotal = BigDecimal.ZERO

    for (preco in produtos) {
        precoTotal += preco
    }
    return precoTotal
}