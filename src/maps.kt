fun main(args : Array<String>) {

    val map = mutableMapOf<Int, Any?>()

    val map2 = mutableMapOf(1 to "Adam", 2 to 25)

    map[1] = "Poo"
    map[2] = 42

    println("Map Size : ${map.size}")

    map.put(3, "Coto")

    map.remove(2)

    for((x, y) in map){
        println("Key : $x Value : $y")
    }

}