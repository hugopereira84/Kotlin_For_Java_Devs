package main.kotlin.collections

data class Hero (
    val name: String,
    val age: Int,
    val gender: Gender?
)
enum class Gender{ MALE, FEMALE}

val heroes = listOf(
    Hero("The Captain", 60, Gender.MALE),
    Hero("Frenchy", 42, Gender.MALE),
    Hero("The Kid", 9, null),
    Hero("Lady Lauren", 29, Gender.FEMALE),
    Hero("First Mate", 29, Gender.MALE),
    Hero("Sir Stephen", 37, Gender.MALE))

fun main() {
    println(heroes.map { it.age }.distinct().size)
    println(heroes.all { it.age < 50 })


    val (age, _) =
        heroes
            .groupBy { it.age }
            .maxBy { (_, group) ->
                group.size
            }
    println(age)

    val mapByName = heroes.associateBy { it.name }
    val unknownHero = Hero("Unknown", 0, null)
    mapByName.getOrElse("unknown") { unknownHero }.age

    // how not to do code
    val (oldest, youngest) = heroes
        .flatMap { heroes.map { hero -> it to hero } }
        .maxBy { it.first.age - it.second.age }!!
    println(oldest.name)
}
