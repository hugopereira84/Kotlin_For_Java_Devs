@file:JvmName("Util") // this is to call all top level function as static ones
package intro


// Resume:
// val - read only variable: immutable object without side effect's
// var - variable you might need to modify
// prefer vals to var, to have objects immutable

fun topLevel() = 1

class A {
    fun member() = 2
}

fun other(): Int{
    fun local() = 3
    return local();
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println("max value is ${max(5, 10)}")


    println("top level is ${topLevel()}")
    println("member function is ${A().member()}")
    println("local function is ${other()}")
}