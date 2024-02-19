package intro_1

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size){
        print(character)
    }
}

fun list() {
    return println(listOf('a', 'b', 'c').joinToString(
        separator = "", prefix = "(", postfix = ")"))
}

@JvmOverloads // this is generate multiple overloads to be used, when calling from java
fun sum(a: Int = 0, b: Int = 0, c: Int=0):Int{
    return a+b+c
}

fun main() {
    println("list ${list()}")
    displaySeparator('A', 3)
    displaySeparator(size = 4, character = 'B')
}