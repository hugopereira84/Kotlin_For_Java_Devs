package extensions_3

fun String.get(index: Int) = '*'

fun main(args: Array<String>) {
    println("abc".get(1)) // member always called, so it will print b and extension is doing nothing
}