package controlStructures_2


// Implement the function that checks whether a string is a valid identifier.
// A valid identifier is a
// non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.
fun isValidIdentifierToDO(stringIdentifier: String): Unit {

    // A valid identifier is a non-empty string
    // that starts with a letter or underscore and
    // consists of only letters, digits and underscores.
}

fun main() {
    println(isValidIdentifierToDO("name"))   // true
    println(isValidIdentifierToDO("_name"))  // true
    println(isValidIdentifierToDO("_12"))    // true
    println(isValidIdentifierToDO(""))       // false
    println(isValidIdentifierToDO("012"))    // false
    println(isValidIdentifierToDO("no$"))    // false
}