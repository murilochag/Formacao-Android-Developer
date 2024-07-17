package br.com.murilochag.controlFlow.`when`

fun whenAssign(obj: Any): Any {
    val result = when(obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else ->42
    }
    return result
}

fun main() {

    println(whenAssign("Hello"))
    println(whenAssign(3L))
    println(whenAssign(1))
    println(whenAssign(Myclass()))
}

class Myclass