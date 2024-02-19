@file:JvmName("UtilsKotlin") // this is to call all top level function as static ones
package extensions_3

fun  List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun String.lastChar() = get(length - 1)

fun main() {
    println("the sum of 1 2 3 is : ${listOf(1, 2, 3).sum()}")    // 6

    println("Last character of 'abcdef' is : ${"abcdef".lastChar()}")    // 6
}