package AbstractFactoryPattern

class GolfCar(location : Location) : Car(CarModel.GOLF, location) {
    init {
        construct()
    }

    override fun construct() = println("Connecting to Golf")
}