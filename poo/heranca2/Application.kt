package br.com.kotlin.poo.heranca2

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val artur = Pessoa("03512288103", "Artur", LocalDate.of(2004, 4,21))
            artur.adotar(Gato())
            artur.adotar(Cachorro())
            artur.adotar(Mamifero())
            artur.adotar(Peixe())

            for (animal in artur.animaisAdotados) {
                when {
                    animal is Cachorro -> animal.latir()
                    animal is Gato -> animal.miar()
                    animal is Peixe -> println("É um peixe!")
                    animal is Mamifero -> println("É um mamifero!")
                }
            }
        }
    }
}