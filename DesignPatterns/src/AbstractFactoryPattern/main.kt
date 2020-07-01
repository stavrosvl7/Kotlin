package AbstractFactoryPattern

fun main(){
    println(CarFactory().buildCar(CarModel.TIGUAN,Location.TURKEY))
    println(CarFactory().buildCar(CarModel.TIGUAN,Location.CHINA))
    println(CarFactory().buildCar(CarModel.TIGUAN,Location.GERMANY))
    println(CarFactory().buildCar(CarModel.GOLF,Location.CHINA))
    println(CarFactory().buildCar(CarModel.GOLF,Location.GERMANY))
    println(CarFactory().buildCar(CarModel.GOLF,Location.TURKEY))
    println(CarFactory().buildCar(CarModel.POLO,Location.CHINA))
    println(CarFactory().buildCar(CarModel.POLO,Location.GERMANY))
    println(CarFactory().buildCar(CarModel.POLO,Location.TURKEY))
}