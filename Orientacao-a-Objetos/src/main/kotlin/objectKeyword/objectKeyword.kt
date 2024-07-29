package objectKeyword

// Classes and objects in Kotlin work the same way as in
// most object-oriented languages: a class is a blueprint,
// and an object is an instance of a class. Usually, you
// define a class and then create multiple instances of
// that class:

import java.util.Random

class LuckDispatcher {                    //1
    fun getNumber() {                     //2
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()             //3
    val d2 = LuckDispatcher()

    d1.getNumber()                        //4
    d2.getNumber()
}