package AbstractFactoryPattern

class TurkeyCarFactory {

    fun buildCar(carModel: CarModel) : Car? {
        var car : Car? = null;
        when(carModel){
            CarModel.POLO -> car = PoloCar(Location.TURKEY)
            CarModel.GOLF -> car = GolfCar(Location.TURKEY)
            CarModel.TIGUAN -> car = TiguanCar(Location.TURKEY)
        }
        return car;
    }
}