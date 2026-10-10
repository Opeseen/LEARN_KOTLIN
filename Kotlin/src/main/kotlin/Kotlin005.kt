
fun main() {
    println("Enter a string:")
    val input = readln()

    val favoriteNumbers = intArrayOf(1,2,3,69)
    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }

    val lambda: (Char) -> Boolean = {
        it.isLetter()
    }

    val lettersOnly = input.filter {
        it.isLetter()
    }

    val lettersOnly2 = input.filter(lambda)

    val lettersOnly3 = input.filter { currentChar ->
        currentChar.isLetter()
    }

    val lettersOnly4 = input.myFilter {
        it.isLetter()
    }

    val evenNumbers2 = favoriteNumbers.map {
        it * it
    }

    val lettersOnly5 = input.myFilter2 {
        isLetter()
    }

    println(evenNumbers2)
}

fun String.myFilter(predicate: (Char) -> Boolean): String{
    return buildString {
        for(char in this@myFilter){
            if(predicate(char)){
                append(char)
            }
        }
    }
}

fun String.myFilter2(predicate: Char.() -> Boolean): String{
    return buildString {
        for(char in this@myFilter2){
            if(char.predicate()){
                append(char)
            }
        }
    }
}