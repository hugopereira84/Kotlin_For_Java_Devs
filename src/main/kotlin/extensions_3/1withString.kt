@file:JvmName("UtilsKotlin") // this is to call all top level function as static ones
package extensions_3

fun String.lastChar() = get(length - 1)

fun main() {
    println("Last character of 'abcdef' is : ${"abcdef".lastChar()}")    // 6
}