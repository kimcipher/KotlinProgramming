import java.util.*

fun main(){

    println("Enter Car Name: ")
    var carName: String? = readLine()

    val number1 = 100
    val number2 = 500
    val sum = number1 + number2
    println("The sum is:$sum") // templating

    val number3 = 200
    val number4 = 500
    val name2 = "kim"


    val sum2 = number3 + number4
    println( "Hey" + "" + name2 + "" + "the sum is" +"" +sum2) //concatenation


    // WRITE A KOTLIN PROGRAM TO CALCULATE SIMPLE INTEREST
    // principal
    // rate
    // time
    // interest = (principal * rate * time)/100

    val principalAmount = 30000
    val interestRate = 5
    val timePeriod = 3
    val interest = (principalAmount * interestRate * timePeriod)/100


    println("Principal amount is: $principalAmount")
    println("The rate of interest is: $interestRate %")
    println("The time period is: $timePeriod years")
    println("The simple interest is: Kshs.$interest")

    //  mutable variables
    var fName = "Zara"
    var lName = "Ali"
    var age = 19

    println("fName = $fName")
    println("lName = $lName")
    println("Age = $age")

    fName = "Nuha"
    lName = "Ali"
    age = 11
    println("fName = $fName")
    println("lName = $lName")
    println("Age = $age")

    // program to ask compute user his/her simple interest

    val input = Scanner(System.`in`)
    println("Enter your Principal:")
    val principal = input.nextInt()
    println("Enter your Rate:")
    val rate = input.nextInt()
    println("Enter your Time:")
    val time = input.nextInt()
    val sInterest = (principal * rate * time)/100
    println("Your Simple interest is: Kshs.$sInterest")



}


