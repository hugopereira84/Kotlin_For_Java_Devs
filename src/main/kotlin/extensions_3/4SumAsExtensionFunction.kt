package extensions_3

// Change the 'sum' function so that it was declared as an extension to List<Int>.
fun sumToRefactor(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun main() {
    println("the sum of 1 2 3 is : ${sumToRefactor(listOf(1, 2, 3))}")    // 6
}
