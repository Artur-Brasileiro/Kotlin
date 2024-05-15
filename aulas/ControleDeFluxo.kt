package br.com.kotlin.aulas

fun main() {
    val tipoDeRota = "aviao"

    // if (se)

    if(tipoDeRota == "A_PE") {
        println("Traçando rota à pé!")
    } else {
        if (tipoDeRota == "CARRO") {
            println("Traçando rota de carro!")
        } else {
            if(tipoDeRota == "ONIBUS") {
                println("Traçando rota de onibus!")
            } else {
                if(tipoDeRota == "ONIBUS") {
                    println("Traçando rota de trem!")
                } else {
                    println("Rota não implementada!")
                }
            }
        }
    }

    // when (quando)

    when(tipoDeRota) {
        in "A_PE" -> println("Traçando rota à pé!")
        in "CARRO" -> println("Traçando rota de carro!")
        in "ONIBUS" -> println("Traçando rota de onibus!")
        in "TREM" -> println("Traçando rota de trem")
        else -> println("Rota não implementada")
    }
}