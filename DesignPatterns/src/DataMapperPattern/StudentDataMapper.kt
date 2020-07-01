package DataMapperPattern

interface StudentDataMapper {
    fun find(student: Student) : Boolean
    fun insert(student : Student)
    fun delete(student : Student)
}