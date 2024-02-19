package controlStructures_2

import controlStructures_2.Color.*

enum class Color{
    BLUE, ORANGE, RED, YELLOW, GREEN, VIOLET, INDIGO
}

// Define the base class Pet
open class Pet(val name: String, val age: Int) {
    open fun sound() = "The pet makes a sound."

}

// Define the Dog class, inheriting from Pet
class Dog(name: String, age: Int) : Pet(name, age) {
    override fun sound() = "The dog barks."

}

// Define the Cat class, inheriting from Pet
class Cat(name: String, age: Int) : Pet(name, age) {
    override fun sound() = "The cat meows."
}

fun getDescription(color: Color): String = when (color){
    BLUE -> "cold"
    ORANGE -> "mild"
    RED -> "hot"
    else -> "no color defined"
}

fun respondToInput(input: String): String = when (input){
    "y", "yes" -> "i am glad you agree"
    "n", "no" -> "sorry to hear that"
    else -> "i don't understand you"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)){
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Dirty Color")
}

fun checkTypesWithSmartCast(pet: Pet): String = when (pet){
    // is instance of
    is Cat -> pet.sound()

    // is instance of
    is Dog -> pet.sound()

    else -> throw Exception("No animal")
}

fun getMyFavoritePet(): Pet {
    return Dog("Buddy", 3)
}
fun getSound(): String =
    when (val pet = getMyFavoritePet()){
        is Cat -> pet.sound()
        is Dog -> pet.sound()
        else -> "---"
    }

fun updateWeather(degrees: Int):String {
    val (description, colour ) = when {
        degrees < 5 -> "cold" to BLUE
        degrees < 23 -> "mild" to ORANGE
        else -> "hot" to RED
    }
    return description.plus(" ").plus(colour)
}


fun main() {
    println("val get description: ${getDescription(BLUE)}")

    println("yes input: ${respondToInput("yes")}")
    println("no input: ${respondToInput("n")}")
    println("other input: ${respondToInput("other")}")

    println("mix color: ${mix(YELLOW, RED)}")
    //println("mix color: ${mix(YELLOW, VIOLET)}")


    // All Kotlin classes are final, so they cannot be inherited.
    // To make a class inheritable, the keyword "open" needs to
    // be present at the beginning of the class signature, which also makes them non-final.
    val myDog = Dog("Buddy", 3)
    val myCat = Cat("Whiskers", 5)
    println("My dog is ${myDog.age} years old and it's name is ${myDog.name}. The sound he does is ${myDog.sound()}")
    println("My cat is ${myCat.age} years old and it's name is ${myCat.name}. The sound he does is ${myCat.sound()}")

    println("dog makes sound: ${checkTypesWithSmartCast(myDog)}")
    println("cat makes sound: ${checkTypesWithSmartCast(myCat)}")
    println("sound of animal: ${getSound()}")

    println("what is weather: ${updateWeather(12)}")
}