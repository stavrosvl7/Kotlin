package DataMapperPattern

class StudentDataMapperImplementation : StudentDataMapper{

    val students = mutableListOf<Student>()

    override fun find(student: Student): Boolean {
        if(students.contains(student)){
            return true
        }
        return false
    }

    override fun insert(studentId: Student) {
        students.add(studentId)
    }

    override fun delete(studentId: Student) {
        students.remove(studentId)
    }
}