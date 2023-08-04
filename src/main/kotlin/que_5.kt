fun main(){
    print("Enter the Month Number: ")
    val input = readLine()?.toIntOrNull()

    val monthName = when (input) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> null
    }

    if (monthName != null) {
        println("The month is: $monthName")
    } else {
        println("Please enter a proper number between 1 and 12.")
    }

}
