package intro_1


// Resume:
// val - read only variable: immutable object without side effects
// var - variable you might need to modify
// prefer vals to var, to have objects immutable
fun valCantBeReAssign() {
    val question: String = "life, the universe";
    println("$question?")

    //question = "sure?"
}


fun localTypeInference() {
    val greeting = "HI";
    val number = 0;

    println("$greeting with number $number")
}

/*fun errorCompiling() {
    var string = 1;
    string = "abc";
}*/

fun modifyObjectReferenceInVal(){
    val languages = mutableListOf("Java");
    languages.add("PHP")
    println("$languages")
}

/*fun errorModifyObjectReferenceInVal(){
    val readOnlyList = listOf("Java");
    readOnlyList.add("PHP")
    println("$readOnlyList")
}*/

fun main() {
    //valCantBeReAssign()
    //localTypeInference()
    modifyObjectReferenceInVal()
}