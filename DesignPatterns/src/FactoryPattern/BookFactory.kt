package FactoryPattern

class BookFactory {

    companion object {
        fun createBook(genre : Genre) : Book = when (genre){
            Genre.SCIENCE -> object : Book {
                private val title = "Effective Java"
                override fun getInfo() = println("$title")
                override fun order() = println("Order $title")
                override fun rate() = println("Rate for $title")
            }
            Genre.LITERATURE -> object : Book{
                private val title = "Da Vinci Code"
                override fun getInfo() = println("$title")
                override fun order() = println("Order $title")
                override fun rate() = println("Rate for $title")
            }
        }
    }
}