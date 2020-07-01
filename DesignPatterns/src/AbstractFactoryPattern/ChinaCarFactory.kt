package AbstractFactoryPattern

class ChinaCarFactory {
    fun buildCar(carModel: CarModel) : Car?{
        var car : Car? = null;

        when(carModel){
            CarModel.POLO -> car = PoloCar(Location.CHINA)
            CarModel.TIGUAN -> car = TiguanCar(Location.CHINA)
            CarModel.GOLF -> car = GolfCar(Location.CHINA)
        }
        return car;
    }
}