package br.com.murilochag.classes

class Customer

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    val contact = Contact(10, "murilo@email.com")

    println(contact.id)
    println(contact.email)
    contact.email = "othermurilo@email.com"
    println(contact.email)
}