// Factorial recursion

//without using tailrec keyword
fun findFactorial(num : Int):Int{
    if(num == 0 || num == 1){
        return num
    }

    var result = num * findFactorial(num-1)
    return result
}

//using tailrec keyword
tailrec fun findfactorial(n: Int, factorial: Long = 1): Long {
    return if (n == 0) {
        factorial
    } else {
        findfactorial(n - 1, factorial * n)
    }
}

fun main(){
    print("Enter the Number:")

    var input = readLine()!!
    var num = input.toInt()

    val factorial = findfactorial(num)

    println("Factorial of the given number $num is : $factorial")
}