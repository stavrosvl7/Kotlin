package AbstractFactoryPattern

class PoloCar(location : Location) : Car(CarModel.POLO,location) {
    init{
        construct()
    }

    override fun construct() = println("Connecting to Polo")
}