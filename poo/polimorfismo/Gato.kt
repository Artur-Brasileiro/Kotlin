package br.com.kotlin.poo.polimorfismo

class Gato: Mamifero() {

    fun miar() {
        println("Miau!!")
    }

    override fun comunicar() {
        miar()
    }
}