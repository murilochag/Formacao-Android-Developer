package heranca

open class Dog {
    open fun sayHallo() {
        println("wow wow!")
    }
}

class Buldog: Dog() {
    override fun sayHallo() {
        println("wif wif!")
    }
}

fun main() {
    val dog = Dog()
    val buldog = Buldog()

    dog.sayHallo()
    buldog.sayHallo()
}