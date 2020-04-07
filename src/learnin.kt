fun main (args : Array<String>) {
    println("Hello world!")

    //val is immutable; which means it is ready only and cannot change
    val myName = "Adam Miedema"

    val longStr = """This is a 
|
|long string""".trimMargin()

    var fName: String = "Adam"
    var lName: String = "Miedema"

    fName = "Don"

    var fullName = fName + " " + lName

    println("Name : $fullName")

    println("1 + 2 = ${1 + 2}")

    println("String Length : ${longStr.length}")

    var str1 = "A random string"
    var str2 = "a random string"

    //returns true or false
    println("Strings Equal : ${str1.equals(str2)}")

    //returns 0 if equal, less than 0 if not
    println("Compare A to B : ${"A".compareTo("B")}")

    //call character at a location index
    println("2nd Index : ${str1[2]}")

    println("Index 2 - 7 : ${str1.subSequence(2, 8)}")

    println("Contains random : ${str1.contains("random")}")

    //var is mutable, can change
    var myAge = 35

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int : " + bigInt)

    //$ is for string interpollation
    println("Smallest Int : $smallInt")

    //Types: Long Double Float Boolean Short Byte Char

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Biggest Long : $bigLong")
    println("Smallest Long : $smallLong")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double : $bigDouble")
    println("Smallest Double : $smallDouble")

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float : $bigFloat")
    println("Smallest Float : $smallFloat")

    if (true is Boolean){
        print("true is boolean\n")
    }

    var letterGrade: Char = 'A'

    println("A is a Char : ${letterGrade is Char}")

    println("3.14 to Int : " + (3.12.toInt()))
    println("A to Int :" + ('A'.toInt()))
    println("65 to Char : " + 65.toChar())

}