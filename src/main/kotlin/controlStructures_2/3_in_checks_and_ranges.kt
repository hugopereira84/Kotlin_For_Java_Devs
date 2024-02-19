package controlStructures_2

import java.time.LocalDate


fun isNotDigit(c: Char )= c !in '0'..'9'

fun dateRangeDifference(): String{
    val startDate : LocalDate = LocalDate.now()
    val endDate : LocalDate =  LocalDate.now().plusDays(1L);
    val dateRange: ClosedRange<LocalDate> = startDate ..endDate

    return "Date Range: ${dateRange.start} to ${dateRange.endInclusive}"
}

fun compareDateWithToday(localDate: LocalDate): Boolean = localDate >= LocalDate.now()
fun compareDateWithRangeDates(localDate: LocalDate): Boolean {
    val startDate : LocalDate = LocalDate.now()
   val endDate : LocalDate =  LocalDate.now().plusDays(66L);
    return localDate in startDate..endDate;
}

fun main() {
    println (" x is not ${isNotDigit('x')} a digit")
    println (" 6 is not ${isNotDigit('6')} a digit")

    println("print dates difference: ${dateRangeDifference()}")

    println("compare date with today: ${compareDateWithToday(LocalDate.now().plusDays(6L))}")
    println("compare with range date: ${compareDateWithRangeDates(LocalDate.now().plusDays(86L))}")
}