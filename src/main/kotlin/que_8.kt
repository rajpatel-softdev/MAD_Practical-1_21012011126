import java.util.*
import kotlin.collections.ArrayList

fun printArray(array: IntArray) {
    print('[')
    for (i in array.indices) {
        print("${array[i]} ")
    }
    print(']')
}

fun bubbleSort(b: IntArray) {
    var n = b.size
    for (i in 0 until n-1) {
        for (j in 0 until n-i-1) {
            if (b[j] > b[j+1]) {
                var temp = b[j]
                b[j] = b[j+1]
                b[j+1] = temp
            }
        }
    }
}

fun main(){

    // Method 1 : using arrayOf() Method
    val array1 = arrayOf(10,90,60,80,100)           // use of <Int> is not mandatory, its for explicit type casting

    println("Create Array-1 using arrayOf() method: ")
    printArray(array1)
    println()

    // Method 2 : using Array<>() --> class constructor
    val array2 = Array(5){0}
    println("Create Array-2 using Array<>() method: ")
    printArray(array2)
    println()

    // Method 3 : using Array<>() and lambda fucntion
    val array3 = Array(8) { index -> index }
    println("Create Array-2 using Array<>() and lambda method: ")
    printArray(array3)
    println()

    // Method 4 : using IntArray()
    val array4 = IntArray(5) {0}
    println("Create Array-4 using IntArray() method: ")
//    printArray(array4)
    println("[${array4.joinToString(", ")}]")
    println()



    val a5 = Array<Int>(size = 5) {index -> index * 2}
    print("Array-5 by using Array<>() and lambda function : ")
    for (i in a5) {
        print(" "+i)
    }
    println("")

    var a6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("2D Array-6 by using arrayOf() and intArrayOf() : "+ Arrays.deepToString(a6))

    var b = IntArray(size = 5)
    println("Please enter Array values : ")
    for (i in 0 until 5) {
        print("a[$i] : ")
        var input = readLine()!!.toInt()
        b[i] = input
    }

    println("Entered Array : ")
    for (elements in b){
        print(" "+elements)
    }
    println("")

    println("**********With Built-in Function**********")
    b.sort()
    println("After Sorting by built-in function : ")
    for (elements in b){
        print(" "+elements)
    }
    println("")

    println("*********Without built-in function**********")
    bubbleSort(b)
    println("After Sorting without built-in function : ")
    for (elements in b){
        print(" "+elements)
    }
    println("")



}