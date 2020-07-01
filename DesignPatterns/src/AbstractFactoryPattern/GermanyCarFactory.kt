package AbstractFactoryPattern

class GermanyCarFactory {
    fun buildCar(carModel: CarModel): Car? {
        var car : Car? = null;

        when(carModel){
            CarModel.POLO -> car = PoloCar(Location.GERMANY)
            CarModel.TIGUAN -> car = TiguanCar(Location.GERMANY)
            CarModel.GOLF -> car = GolfCar(Location.GERMANY)
        }
        return car;
    }
}