package controlStructures_2

fun loop() {
    val list = listOf("a", "b", "c")
    for ( s:String in list ){
        println (s)
    }
}

fun loopWithMap() {
    val map = mapOf( 1 to "one", 2 to "two", 3 to "three")
    for ( (key, value) in map ){
        println ("$key = $value")
    }
}

fun loopWithList() {
    val list = listOf("a", "b", "c")
    for ( (key, value) in list.withIndex() ){
        println ("$key = $value")
    }
}


fun iteratingOverRange() {
// including upper bound
    for ( i in 1..6){
        println (" val: $i")
    }
}

fun iteratingOverRangeWithUntil() {
    // excludes upper bound
    for ( i in 1 until 6){
        println (" val: $i")
    }
}

fun iterateOverString(){
    for (ch in "abc") {
        print(ch + 1)
    }
}

fun main() {
    loop()

    loopWithMap()

    loopWithList()

    iteratingOverRange()

    iteratingOverRangeWithUntil()

    iterateOverString()

}