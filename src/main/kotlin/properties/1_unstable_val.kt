package main.kotlin.properties

import kotlin.random.Random

var counter = 0
val foo1: Int
    get() =  Random.nextInt()

val foo2: Int
    get() =  counter++

val foo3: String
    get() =  "example"

val foo4: String
    get() : String {
        println("it will show")
        return "test"
    }
fun main() {
    // The values should be different:
    println(foo1)
    println(foo1)
    println(foo1)
    println(foo3)
    println(foo4)
}
