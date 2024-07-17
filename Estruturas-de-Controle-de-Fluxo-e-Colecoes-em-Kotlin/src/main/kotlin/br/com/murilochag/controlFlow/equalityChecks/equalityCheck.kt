package br.com.murilochag.controlFlow.equalityChecks

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // estrutura
    println(authors === writers)  // referencias do objeto

}