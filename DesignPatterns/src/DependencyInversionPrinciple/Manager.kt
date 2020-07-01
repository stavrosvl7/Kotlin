package DependencyInversionPrinciple

class Manager {
    var emploees = mutableListOf<Emploee>()

    fun addEmploee(emploee: Emploee){
        emploees.add(emploee)
        print("${emploee.javaClass.name.toString()} has been added \n")
    }
}