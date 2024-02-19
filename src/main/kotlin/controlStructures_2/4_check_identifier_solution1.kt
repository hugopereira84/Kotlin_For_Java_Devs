package controlStructures_2


// Implement the function that checks whether a string is a valid identifier.
// A valid identifier is a
// non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.
fun isValidIdentifierSolution1(stringIdentifier: String): Boolean {
    if(stringIdentifier.isEmpty() || stringIdentifier[0] in '0' .. '9') return false


    fun isValidCharacter(ch: Char) =
        ch in 'a' .. 'z' ||
        ch in 'A' .. 'Z' ||
        ch == '_' ||
        ch in '0' .. '9'

    for ( s:Char in stringIdentifier ){
        if (!isValidCharacter(s)) return false
    }

    return true
}

fun main() {
    println(isValidIdentifierSolution1("name"))   // true
    println(isValidIdentifierSolution1("_name"))  // true
    println(isValidIdentifierSolution1("_12"))    // true
    println(isValidIdentifierSolution1(""))       // false
    println(isValidIdentifierSolution1("012"))    // false
    println(isValidIdentifierSolution1("no$"))    // false
}