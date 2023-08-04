fun main(){
    print("Enter the Size of Array: ")
    var input = readLine()!!
    var size = input.toInt()

    // creating array of given size
    val array = IntArray(size)

    println("Enter $size elements:")
    for (i in 0 until size){
        print("Element $i: ")
        array[i] = readLine()?.toInt() ?:0
    }

    //finding largest number
    var largest = array[0]
    for(i in 1 until size){
        if(array[i] > largest){
            largest = array[i]
        }
    }

    println("Largest NUmber from given data is : $largest")
}