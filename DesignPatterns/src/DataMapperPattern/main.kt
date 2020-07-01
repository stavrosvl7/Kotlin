package DataMapperPattern

fun main(){
    var student1 : Student = Student(0,"stavros",23,10)
    var student2 : Student = Student(0,"kostas",28,8)
    var student3 : Student = Student(0,"gianna",20,9)
    var studentDataMapperImplementation : StudentDataMapperImplementation = StudentDataMapperImplementation();
    println(studentDataMapperImplementation.students.size)
    studentDataMapperImplementation.insert(student1)
    studentDataMapperImplementation.insert(student2)
    studentDataMapperImplementation.insert(student3)
    if(studentDataMapperImplementation.find(student1) == true){
        println(student1.getName())
    }
    println(studentDataMapperImplementation.students.size)
    studentDataMapperImplementation.delete(student2)
    if(studentDataMapperImplementation.find(student2) == true){
        println(student2.getName())
    }
    println(studentDataMapperImplementation.students.size)

}