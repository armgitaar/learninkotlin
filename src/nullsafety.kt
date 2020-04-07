fun main(args : Array<String>) {

    //by default, cannot assign something to null; add question mark to override
    var nullVal: String? = null

    fun returnNull(): String?{
        return null
    }

    var nullVal2 = returnNull()

    if(nullVal2 != null){
        println("nullVal2.length")

    }

    var nullVal3 = nullVal2!!.length

    var nullVal4: String = returnNull() ?: "No Name"
}