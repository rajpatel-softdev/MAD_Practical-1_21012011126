import java.util.Scanner;
// read and learn about NULL SAFTY
// also about readLine()!! vs realLine()
fun main(){
    println("Enter the Number:")

    var input = readLine()!!
    var n= input.toInt()
    if(n%2==0)
        println("$n is Even")
    else
        println("$n is Odd")
}