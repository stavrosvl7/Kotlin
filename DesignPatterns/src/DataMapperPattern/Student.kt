package DataMapperPattern

class Student(studentId : Int , name : String, age : Int, grade : Int) {
    private var studentId : Int? = null
    private var name : String? = null
    private var age : Int? = null
    private var grade : Int? =null

    init {
        this.studentId = studentId
        this.name = name
        this.age = age
        this.grade = grade
    }

    fun getName() : String? {
        return this.name
    }
}