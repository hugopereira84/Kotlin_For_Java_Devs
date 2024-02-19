package controlStructures_2

//fun checkIfBigggerThen100(number: Int) = number in 0..100 ? true: throw IllegalArgumentException("number must be between 0 and 100")
fun checkIfNumberIsBetween0and100(number: Int): Boolean =
    if(number in 0..100)
       true
    else
        throw IllegalArgumentException("number must be between 0 and 100")

fun checkIfNumberIsBetween0and100_version2(number: Int): Boolean  =
    when (number) {
        in 0..100 -> true
        else -> throw IllegalArgumentException("Number must be between 0 and 100: $number")
    }

fun main() {
    println("is number between 0 and 100? ${checkIfNumberIsBetween0and100(6)}")
    println("is number between 0 and 100? ${checkIfNumberIsBetween0and100(122)}")
    //println("is number between 0 and 100? ${checkIfNumberIsBetween0and100_version2(6)}")
    //println("is number between 0 and 100? ${checkIfNumberIsBetween0and100_version2(122)}")

}