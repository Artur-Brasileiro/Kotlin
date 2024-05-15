package br.com.kotlin.poo.classes

import java.time.LocalDate

class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val artur = Pessoa("12345678910", "Artur", LocalDate.of(2004, 4, 21))
            artur.falar("Olá mundo da programação orientada a obejtos!")
        }
    }
}