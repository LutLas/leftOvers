package ootereh.was.saltul
import ereh.saw.saltul.*
fun main() {
    Duck().doStuff("Master")
    println(Parent().a)
    println(Child().c)
    println(Parent().d)
    var selectedBandMember = BandMember.JERRY
    println("Band member $selectedBandMember plays the ${ selectedBandMember.instrument }, He ${ selectedBandMember.sings() } sings.")

    selectedBandMember = BandMember.BOBBY
    println("On the other hand band member $selectedBandMember instrument of chose is ${ selectedBandMember.instrument } his sings ${ selectedBandMember.sings() }.")

    selectedBandMember = BandMember.PHIL
    println("Last but not the least is $selectedBandMember who plays the ${ selectedBandMember.instrument } and ${ selectedBandMember.sings() } sings.")

    val messageSuccess = MessageSuccess("Yay!")
    val messageSuccess2 = MessageSuccess("It worked!")
    val messageFailure = MessageFailure("Boo!", Exception("Gone Wrong"))

    var myMessageType: MessageType = messageFailure

    val myMessage = when(myMessageType){
        is MessageSuccess -> myMessageType.msg
        is MessageFailure -> myMessageType.msg + "" + myMessageType.e.message

    }
    println(myMessage)
}