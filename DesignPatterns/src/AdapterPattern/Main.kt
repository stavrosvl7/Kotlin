package AdapterPattern


fun main(args : Array<String>){
    val sparrow = Sparrow()
    val goldenEye : Duck = GoldenEye()

    // Wrap a bird in a birdAdapter so that it
    // behaves like toy duck
    val birdAdapter: Duck = BirdAdapter(sparrow)
    println("Sparrow...")
    sparrow.fly()
    sparrow.makeSound()
    println("ToyDuck...")
    goldenEye.squeak()

    // toy duck behaving like a bird
    println("BirdAdapter...")
    birdAdapter.squeak()


}