import java.util.*
fun main(){
            // kotlin conditions -> the code execution is controlled by conditional statements
    // if, if..else,if..else if, nested, when conditions

    // if condition
    // syntax: if (expression){statements}
    var reader9 = Scanner(System.`in`)
    println("Enter Number:")
    var number = reader9.nextInt()

    if (number > 0){
        println("The number is positive.")
    }

    // if...else condition
    // if condition
    // syntax: if (expression){statements}
    var reader2 = Scanner(System.`in`)
    println("Enter Number:")
    var number2 = reader2.nextInt()

    if (number2 >= 0){
        println("The number is positive.")
    }
    else{
        println("The number is negative.")
    }

//    // write a kotlin program to test whether a number is odd or even
    var oddEven = Scanner(System.`in`)
    println("Whats the number?")
    var num = oddEven.nextInt()

    if (num % 2 == 0){
        println("number is even")

    }
    else
    {
        println("number is odd")
    }


    // else if conditions
    // days of the week
    // 1 -> Sunday
    // 2 -> Monday
    var days = Scanner(System.`in`)
    println("Enter day of week, eg, 1 for Sunday:")
    var day = days.nextInt()

    if (day == 1) {
        println("Sunday")
    }
    else if (day == 2){
        println("Monday")
    }
    else if (day == 3){
        println("Tuesday")
    }
    else if (day == 4){
        println("Wednesday")
    }
    else if (day == 5){
        println("Thursday")
    }
    else if (day == 6){
        println("Friday")
    }
    else if (day == 7){
        println("Saturday")
    }
    else
    {
        println("Please enter number 1...7")
    }

    // when conditions
    var reader4 = Scanner(System.`in`)
    println("Weka siku ya wiki, eg, 1 for Sunday:")
    var siku = reader4.nextInt()

    when(siku){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid")
    }

    // when passing an expression
    // Algorithm
    /* 0-40 ->E
        41-50 -> D
        51-60 -> C
        61-70 -> B
        71-100 -> A
     */
    var reader5 = Scanner(System.`in`)
    println("What are the marks?")
    var grade = reader5.nextInt()

    when{
        (grade > 0 && grade<=40) -> println('E')
        (grade > 40 && grade<=50) -> println('D')
        (grade > 50 && grade<=60) -> println('C')
        (grade > 60 && grade<=70) -> println('B')
        (grade > 70 && grade<=100) -> println('A')
        else -> println("PLease input correct marks!!")

    }

    // when condition when using a range check type1
    var reader6 = Scanner(System.`in`)
    println("What are the marks?")
    var marks = reader6.nextInt()

    when{
        (marks in 0..40) -> println('E')
        (marks in 41..50) -> println('D')
        (marks in 51..60) -> println('C')
        (marks in 61..70) -> println('B')
        (marks in 71..100) -> println('A')
        else -> println("PLease input correct marks!!")

    }

    // Nested if condition
    /* telcom points
    500 points: Congrats, you qualify for a trip
    age < 25 : A fun trip
    age > 25 : Educational trip

     */
    var reader7 = Scanner(System.`in`)
    println("What are the points?")
    var points = reader7.nextInt()

    if (points > 500){
        println("Congrats you qualify for a trip")
        println("Enter age:")
        var age = reader7.nextInt()
        if (age > 25){
            println("You qualify for a educational trip")
        }
        else {
            println("You qualify for a fun trip")
        }
    }
    else{
        println("You dont qualify for a trip, try again")
    }

    // program for calculating a leap year, checks and prints out whether the year entered is one

        var reader = Scanner(System.`in`)
        println("Enter Year : ")
        var year = reader.nextInt();

        var leap = if (year % 4 == 0){
            if (year % 100 == 0) {

                year % 400 == 0
            } else true
        } else false;

        println(if (leap) "$year is a leap year." else "$year is not a leap year.")
    }


