package br.com.kotlin.aulas

import java.time.*
import java.util.*

fun main() {
    // Conhecendo os tipos datas no Kotlin
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()

    println(date)
    println(localDate)
    println(localDateTime)
}