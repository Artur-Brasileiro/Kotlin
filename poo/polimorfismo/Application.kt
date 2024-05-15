package br.com.kotlin.poo.polimorfismo

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val artur = Pessoa("03512288103", "Artur", LocalDate.of(2004, 4,21))
            artur.adotar(Gato())
            artur.adotar(Cachorro())
            artur.adotar(Peixe())

            for (animal in artur.animaisAdotados) {
                animal.comunicar()
            }
        }
    }
}