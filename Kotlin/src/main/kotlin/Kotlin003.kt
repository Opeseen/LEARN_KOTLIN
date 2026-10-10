fun main() {
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull()
//    val favoriteNumbers = intArrayOf(1,2,3,69) + 5
//
//    if(inputAsInteger != null && inputAsInteger in 0..favoriteNumbers.size){
//        println("Your number is ${favoriteNumbers[inputAsInteger]}")
//    }else{
//      println("That index doesn't exists")
//    }
//    println(favoriteNumbers[2])
//    println(favoriteNumbers.getOrNull(4))

//    println("How many numbers will you enter..?")
//    val amountOfNumbers = readln().toIntOrNull() ?: 0
//    var sum = 0
//    var numbers = intArrayOf()
//    val numbers = mutableListOf<Int>()
//    var i = 0
//    while (i < amountOfNumbers){
//        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue
//        numbers.add(number)
//        i++
//    }

//    for (i in 0 until amountOfNumbers){
//        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue
//        numbers.add(number)
//    }
//    println("The total sum is $numbers")

//    for (number in numbers){
//        println("Numbers is $number")
//    }


    println("Enter a string:")
    val input = readln()

    val finalString = buildString {
        for(i in input.lastIndex downTo 0 ){
            append(input[i])
        }
    }
    println(finalString)

}