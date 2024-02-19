package main.kotlin.properties


private var StringBuilder.lastChar: Char
    get() = get(length -1)
    set(value: Char) {
        this.setCharAt(length-1, value)
    }

fun main() {
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}
