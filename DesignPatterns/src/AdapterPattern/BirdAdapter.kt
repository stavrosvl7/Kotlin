package AdapterPattern

class BirdAdapter constructor(bird: Bird) : Duck {
    val bird : Bird = bird

    override fun squeak() {
        bird.makeSound()
    }
}