
fun main() {
    println("Enter a string:")
//    val input = readln()
//    val reversed = reversed(input)
    val input = readln().toInt()

    val reversed = input.reversed1();
    println(reversed)

}

fun reversed(stringToReverse: String): String{
    val finalString = buildString {
        for(i in stringToReverse.lastIndex downTo 0 ){
            append(stringToReverse[i])
        }
    }
    return finalString
}

fun String.reversed2(): String{
    val finalString = buildString {
        for(i in this@reversed2.lastIndex downTo 0 ){
            append(this@reversed2[i])
        }
    }
    return finalString
}

fun Int.reversed1(): Int{
    return this.toString().reversed2().toInt()
}



