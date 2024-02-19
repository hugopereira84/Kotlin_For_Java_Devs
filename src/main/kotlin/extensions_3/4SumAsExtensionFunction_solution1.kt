package extensions_3

fun  List<Int>.sumSolution1(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun main() {
    println("the sum of 1 2 3 is : ${listOf(1, 2, 3).sumSolution1()}")    // 6
}
