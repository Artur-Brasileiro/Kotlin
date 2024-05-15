package br.com.kotlin.aulas

fun main() {

    val map1 = mapOf<Int, String>(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Normal",
        4 to "Bom",
        5 to "Muito Bom"
        )

    val mutablel = mutableMapOf(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Normal",
        4 to "Bom"
    )
    mutablel.put(5, "Muito Bom")

    println(map1.get(1))
    println(mutablel)
}