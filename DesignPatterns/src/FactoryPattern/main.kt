package FactoryPattern

import java.lang.IllegalArgumentException

fun main(){
    val genre = "SCIENCE"

    val book = BookFactory.createBook(when(genre){
        "SCIENCE" -> Genre.SCIENCE
        "LITERATURE" -> Genre.LITERATURE
        else -> throw IllegalArgumentException("There is no book of this genre/category")
    })

    println("Getting the book info: ")
    book.getInfo()
    println("Order book: ")
    book.order()
    println("Rate book: ")
    book.rate()
}