package AbstractFactoryPattern

abstract class Car (model: CarModel, location: Location){
    var model: CarModel? = null
    var location: Location? = null

    init{
        this.model = model
        this.location = location
    }

    abstract fun construct()

    override fun toString(): String {
        return "Car Model - $model made in $location"
    }
}