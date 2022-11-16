/* Kotlin functions --
-> is a group/block of code that will execute only when it is called/referenced
-> created to perform a specific task on the problem
-> creating/calling a function
-> functions are created outside the main function, then call inside the main function
-> fun keyword (create a function)
-> categories
i) inbuilt-functions{println(), toString())
ii) user-defined functions{ created by programmer for a program-specific-task }
 */
import java.util.*
var message = "Foreign Exchange"


fun main(){
    // CALLING A FUNCTION--
    interest(2000,4.5,6)
    converter()
    var result = bmi(70,1.87)
    println("Your BMI is $result")
}

// end main

// function to calculate SI
fun interest(principal:Int, rate:Double, time:Int){


    var SI = (principal * rate * time)/100
    println("The interest is $SI")
}

fun converter(){
    println(message)
    var input = Scanner(System.`in`)
    println("Enter Amount you wish to convert in Kshs:")
    var amountShilling = input.nextDouble()
    // CONVERSIONS--
    var amountDollars = amountShilling * 121
    var amountEuro = amountShilling * 126
    var amountPound = amountShilling * 144

    println(" $amountShilling in Dollar is Kshs. $amountDollars \n  $amountShilling in Euro is Kshs.  $amountEuro \n" +
            "$amountShilling in Pound is Kshs. $amountPound")

}

// functions with return types
// every function must have a return type, if not none by default

fun bmi(weight:Int, height:Double):Double{
    val BMI = weight/(height * height)

    return BMI
}