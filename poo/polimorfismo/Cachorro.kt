package br.com.kotlin.poo.polimorfismo

class Cachorro: Mamifero() {

    fun latir() {
        println("Au, Au!!")
    }

    override fun comunicar() {
        latir()
    }
}