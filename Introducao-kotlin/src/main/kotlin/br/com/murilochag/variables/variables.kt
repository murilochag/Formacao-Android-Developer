package br.com.murilochag.variables

fun main() {

    var a: String = "initial"
    println(a)
    a = "final"
    val b: Int = 1
    val c = 3
    println(b)
    println(c)


    val d: Int
    if (false) {
        d = 1
    } else {
        d = 2
    }
    println(d)
}