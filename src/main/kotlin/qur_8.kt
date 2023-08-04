fun printArray(array: Array<Int>){
    print('[')
    for(i in array.indices){

        print("${array[i]} ")
    }
    print(']')
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







}