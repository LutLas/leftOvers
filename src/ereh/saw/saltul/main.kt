package ereh.saw.saltul

class Duck{
    fun doStuff(x:String){
        println("You just type, \"$x\".")
    }
}

open class Parent{
    var a =1
    private var b = 2
    protected open var c = 3
    internal var d = 4
}

class Child:Parent(){
   public override var c = 6
}

class Other(x:Int)

enum class BandMember(
    val instrument:String
) {
    JERRY("lead guitar"){
        override fun sings() = "plaintively"
    },
    BOBBY("rhythm guitar"){
        override fun sings() = "hoarsely"
    },
    PHIL("bass");

    open fun sings() = "occasionally"
}

sealed class MessageType
class MessageSuccess(var msg: String): MessageType()
class MessageFailure(var msg: String, var e:Exception): MessageType()

