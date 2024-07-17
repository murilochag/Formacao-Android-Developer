package br.com.murilochag.controlFlow.`when`

fun case(obj: Any) {
    when(obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}


fun main() {
    case(1)
    case(2)
    case("murilo")
    case(4.5)
    case(10L)
    case("Hello")

}