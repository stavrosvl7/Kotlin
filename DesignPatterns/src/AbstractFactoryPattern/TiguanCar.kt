package AbstractFactoryPattern

class TiguanCar(location : Location) : Car(CarModel.TIGUAN, location) {
    init{
        construct()
    }

    override fun construct() = println("Connecting to Tiguan")
}