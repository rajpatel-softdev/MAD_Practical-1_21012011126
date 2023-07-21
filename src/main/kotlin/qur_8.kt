// learning Array in Kotlin

fun printArray(array: Array<Int>, size:Int){
//    print('[')
//    for (i in 0 until size){
//
//    }

    for(i in array.indices){
        print('[')
        print("${array[i]} ")
        print(']')
    }
}

fun main(){

    // Method 1 : using arrayOf() Method
    val array1 = arrayOf<Int>(10,90,60,80,100)     // use of <Int> is not mandatory, its for explicit type casting

    println("Create Array-1 using arrayOf() method : ")





}