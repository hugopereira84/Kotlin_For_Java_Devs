package extensions_3


fun  List<Int>.sumSolution2(): Int {
    // using an extension, inside of extension
    return this.sum()
}

fun main() {
    println("the sum of 1 2 3 is : ${listOf(1, 2, 3).sumSolution2()}")    // 6
}
