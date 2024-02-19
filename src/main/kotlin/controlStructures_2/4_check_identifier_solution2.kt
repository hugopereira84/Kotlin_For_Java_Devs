package controlStructures_2


// Implement the function that checks whether a string is a valid identifier.
// A valid identifier is a
// non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.
fun isValidIdentifierSolution2(stringIdentifier: String): Boolean {
    /*Explanation:
    ^: Matches the beginning of the string.
    [a-zA-Z_]: Matches a single letter (a-z or A-Z) or an underscore.
    \w: Matches any word character (letter, digit, or underscore).
    *: Matches zero or more of the preceding character (word characters in this case).
    $: Matches the end of the string.*/
    val regex = """^[a-zA-Z_]\w*${'$'}""".toRegex()
    return regex.matches(stringIdentifier)
}

fun main() {
    println(isValidIdentifierSolution2("name"))   // true
    println(isValidIdentifierSolution2("_name"))  // true
    println(isValidIdentifierSolution2("_12"))    // true
    println(isValidIdentifierSolution2(""))       // false
    println(isValidIdentifierSolution2("012"))    // false
    println(isValidIdentifierSolution2("no$"))    // false
}