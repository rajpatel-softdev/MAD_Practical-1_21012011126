// using primary constructor
class Student(val enrollment_no: Long, val name: String, val branch: String){
    constructor(enrollment_no: Int, name: String, branch: String) : this(enrollment_no.toLong(), name, branch)
}

fun main(){
    val s1 = Student(21012011126, "Raj Patel", "CE")

    println("Enrollment No: ${s1.enrollment_no}")
    println("Name: ${s1.name}")
    println("Branch: ${s1.branch}")
}
