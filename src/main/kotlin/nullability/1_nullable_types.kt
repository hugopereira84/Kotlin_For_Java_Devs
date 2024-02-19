package main.kotlin.nullability

fun foo(list1: List<Int?>, list2: List<Int>?) {
     list1.size
    list2?.size

     val i: Int? = list1.get(0)
     val j: Int? = list2?.get(0)
}

fun main() {
    val s1: String? = null
    val s2: String? = ""
    println(s1.isEmptyOrNull() == true)
    println(s2.isEmptyOrNull() == true)

    val s3 = "   "
    println(s3.isEmptyOrNull() == false)
}

fun String?.isEmptyOrNull() = this == null || this.isEmpty()