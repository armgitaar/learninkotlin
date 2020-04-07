fun main(args : Array<String>) {

    val bowser = Animal("Bowser", 20.0, 13.5)
    bowser.getInfo()

    val spot = Dog("Spot", 20.0, 14.5, "Adam Miedema")
    spot.getInfo()

    val tweety = Bird("Tweety", true)

    tweety.fly(10.0)

}

open class Animal(val name: String, var height: Double, var weight: Double){

    init {
        //regular expressions
        val regex = Regex(".*\\d+.*")

        require(!name.matches(regex)) {"Animal name cannot contain numbers"}

        require(height > 0) {"Height must be greater than 0"}
        require(weight > 0) {"Weight must be greater than 0"}
    }

    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight")
    }
}

//Inheritance
class Dog(name: String, height: Double, weight: Double, var owner: String) : Animal(name, height, weight){
    override fun getInfo(): Unit {
        println("$name is $height and $weight and is owned by $owner")
    }
}

interface Flyable{
    var flies: Boolean
    fun fly(distMile: Double): Unit
}

class Bird constructor(val name: String, override var flies: Boolean = true) : Flyable {
    override fun fly(distMile: Double): Unit{
        if(flies){
            println("$name flies $distMile miles")
        }
    }
}
