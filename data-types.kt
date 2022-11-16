fun main(){
    // learning kotlin data types
    // data type is format of data/value stored on a variable, to determine operations that can be done
    // variable is a container to hold values/data

    /*
    1. Numeric types
    -> Numbers - (Byte, Short, Int, Long)
    -> Decimals - (Float, Double)
    2. Letter types (Char, String)
    3. Booleans types (true, false)
    4. Arrays types (collections)

    */


    // Numeric types - Numbers
    // a) Byte -> Numeric value -128 and 127
    var numberByteMin:Byte = Byte.MIN_VALUE
    var numberByteMax:Byte = Byte.MAX_VALUE
    println("The minimum value of Byte is $numberByteMin and maximum value is $numberByteMax")
    // b) Short -> numeric value -32768 and 32767
    var numberShortMin:Short = Short.MIN_VALUE
    var numberShortMax:Short = Short.MAX_VALUE
    println("The minimum value of Short is $numberShortMin and maximum value is $numberShortMax")
    // c)  Int -> numeric value -2147483648 and 2147483647
    var numberIntMin:Int = Int.MIN_VALUE
    var numberIntMax:Int = Int.MAX_VALUE
    println("The minimum value of Int is $numberIntMin and maximum value is $numberIntMax")
    // d)  Long -> numeric value -9223372036854775808 and 9223372036854775807
    var numberLongMin:Long = Long.MIN_VALUE
    var numberLongMax:Long = Long.MAX_VALUE
    println("The minimum value of Long is $numberLongMin and maximum value is $numberLongMax")

    // Numeric types - Decimals
    // a) Float -> numeric value .0000000000000000000000000000000000000000000014 and 3.4028235E38
    var numericFloatMin:Float = Float.MIN_VALUE
    var numericFloatMax:Float = Float.MAX_VALUE
    println("The minimum value of Float is $numericFloatMin and maximum value is $numericFloatMax")

    // b)Double -> numeric value 4.9E-324 and .7976931348623157E308
    var numericDoubleMin:Double = Double.MIN_VALUE
    var numericDoubleMax:Double = Double.MAX_VALUE
    println("The minimum value of Float is $numericDoubleMin and maximum value is $numericDoubleMax")

    // Letters type
    // a) Char -> A single letter enclosed using single quotes
    var alphabet = 'A'
    print("Is $alphabet a character?: ${alphabet is Char}")

    // a) String -> Sequence of characters enclosed using either double or single
    var word = "Awoo"
    print("Is $word a string?: ${word is String}")

    // Boolean type -> take two instances true, false
    var numberBool = 0

    println("${numberBool == 0}")

    //type functions -> convert one datatype to another
    // toString(), toDouble(), toInt(), toFloat()

    var numberDouble:Double = 45.7865
    var numberInt:Int = numberDouble.toInt()
    println(numberInt)

    var letter:Char = 'J'
    var letterString:String = letter.toString()
    println("$letterString is string? ${letterString is String}")
    println(letterString)

    // array types -> hold collection of values
    //arrayOf() -> datatype not specified (heterogeneous)
    // accessing array elements, we use indexing[]
    var studentInfo = arrayOf("Jack Slayer", 23, "male", "Data Science", true, 'B')
    println(studentInfo[0])
    // arrayOf<Int>(), arrayOf<String>() -> when types of data stored on array is specified (homogenous)
    var countiesKenya = arrayOf<String>("Nairobi", "Kiambu", "Nyeri", "Kilifi", "Uasin Gishu")
    println(countiesKenya[3])

    // Array Operations
   var sizeStudentInfo = studentInfo.size
    println(sizeStudentInfo)

    println(studentInfo.get(3))
    println(studentInfo.slice(indices = 2..3))

    println(countiesKenya.slice(indices = 0..4))

}