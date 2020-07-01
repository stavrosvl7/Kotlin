package DependencyInversionPrinciple

fun main(args : Array<String>){

    val manager = Manager();
    val developer = Developer();
    val designer = Designer();
    val tester = Tester();

    manager.addEmploee(developer)
    manager.addEmploee(designer)
    manager.addEmploee(tester)


}
