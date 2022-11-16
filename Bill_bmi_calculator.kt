// Kotlin's beta 1.0 program that request the user's height and weight and calculates his BMI

import java.util.*
fun main(){
//    val input = Scanner(System.`in`)
//    println("Enter your height:")
//    val height = input.nextDouble()
//    println("Enter your weight:")
//    val weight = input.nextDouble()
//
//    val bmi = (weight) / (height * height)
//    println("Your bmi is: $bmi")

    /* WRITE A KOTLIN PROGRAM TO CALCULATE TOTAL ELECTRICITY
    BILL TO PAID BASED ON UNITS CONSUMED ACCORDING TO THE GIVEN CONDITIONS
     */
    var reader = Scanner(System.`in`)
    println("What is the bill?")
    var bill = reader.nextInt()

    when {
        (bill in 0..50) -> println(0.50*bill)
        (bill in 51..100) -> println(1.00*bill)
        (bill in 101..200) -> println(1.20*bill)
        (bill >= 250) -> println(1.50*bill)

        else -> println("PLease input correct units!!")
    }
}

/* BMI = weight/(height*height) */

