package intro_1

fun foo(): String {
    println("Calculation foo")
    return "foo";
}

fun main(args: Array<String>) {
    //val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    //println("Hello World! This is $name!")

    // Test the null being shown
    //println("Program arguments: ${args.getOrNull(0)}")

    // Tested what is printed
    println("First ${foo()}, second ${foo()}")
}