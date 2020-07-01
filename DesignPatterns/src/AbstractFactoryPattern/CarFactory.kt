package AbstractFactoryPattern

class CarFactory {

    fun buildCar(model: CarModel , location: Location) : Car? {
        var car: Car? = null

        when(location){
            Location.TURKEY -> car = TurkeyCarFactory().buildCar(model)
            Location.GERMANY -> car = GermanyCarFactory().buildCar(model)
            Location.CHINA -> car = ChinaCarFactory().buildCar(model)
        }
        return car
    }

}