fun main(args : Array<String>) {

    var myArray = arrayOf(1, 1.23, "Adam")

    println(myArray[2])

    myArray[1] = 3.14

    println("Array Length : ${myArray.size}")

    println("Adam in Array : ${myArray.contains("Adam")}")

    var partArray = myArray.copyOfRange(0,1)

    println("First : ${myArray.first()}")

    println("Adam Index : ${myArray.indexOf("Adam")}")

    var sqArray = Array(5, {x -> x * x})

    println(sqArray[3])

    var arr2: Array<Int> = arrayOf(1,2,3)

}