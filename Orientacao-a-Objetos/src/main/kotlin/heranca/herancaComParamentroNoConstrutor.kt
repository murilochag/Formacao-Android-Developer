package heranca

open class Tiger(val origin: String) {
    fun sayHallo() {
        println("A Tiger from $origin says: grrhhh! ")
    }
}

class  SiberianTiger: Tiger("Siberia")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHallo()
}