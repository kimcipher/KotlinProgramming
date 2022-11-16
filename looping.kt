import java.util.*


fun main(){
    /* kotlin looping statements -> block of code executed a number of times depending on the condition
    a) For loop
    b) While loop
    c) Do while loop

     */
    /* For loop
    i) range: syntax for (variable in..) {}
     */

    for (index in 1 .. 10){
        println("$index loop")
    }

    // ii) list
    val cars = arrayOf("Wagon","BMW","AUDI","VOLKSWAGEN","CADILLAC","ESCALADE","DODGE")
    for (car in cars){
        if (car == "CADILLAC"){
            continue // skip
        }
        println("$car On sale")
    }
    // Task
    /* create a list of at least 15 counties in kenya
    create two empty lst namely : counties_with_single_names / counties_with_double_names
     */
    val counties = arrayOf("Nairobi","Makueni","Mombasa","Kiambu","Marsabit","Turkana","Uasin Gishu",
    "Elgeyo Marakwet","Kajiado","Tharaka Nyithi","Nyeri","Taita Taveta","Tana River","Kwale","Kilifi")

    val single = arrayListOf<String>()
    val double = arrayListOf<String>()
    for (county in counties){
        if (" " in county){
            double.add(county)
        }
        else{
            single.add(county)
        }
    }

    println("List with counties_with_double_names is $double")
    println("List with counties_with_single_names is $single")


    // while loop
    /* Syntax: variable = value
                while(variable expression){statements
                increments/decrement}
     */
    println("Program to print 0...10")
    var input = Scanner(System.`in`)
    println("Enter Value:")
    var value = input.nextInt() // start point

    while(value <= 10){ // limit check/condition
        println(value)
        value ++ //increment/decrement
    }
    println("Program to print 1000,900,800..100")
    var number = 1000
    while(number >= 100){
        println(number)
        number -= 100
    }

    // Do while loop
    // at least one statement should be executed
    println("Program to count 10")
    var count = 0
    do {
        println(count)
        count += 1
    }
        while (count < 10)

        // statements and increments is done on the do keyword
        // expression is checked on the while condition

}