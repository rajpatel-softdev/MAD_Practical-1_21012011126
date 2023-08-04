fun main(){

    print("Enter the Number: ")
    var num = readLine()!!.toInt()

    if(num % 2 == 0){
        println("Given Number is EVEN!!!")
    }
    else{
        println("Given Number is ODD!!!")
    }
}