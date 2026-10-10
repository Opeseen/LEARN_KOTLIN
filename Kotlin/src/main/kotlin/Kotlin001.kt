fun main() {
    println("Hello World")
    val x = 5
    println(x)
    val y: Int = 6
    println(y)
    val z: Float = 4f
    println(z)

    val a: Boolean = true
    println(a)

    var c = "Hello World";
    c = "ByeBye"
    println(c)

    val one = 5
    val two = 9
    println(two/one)

    var x2 = 11
    x2--
    println(x2)
    println(x == y)
    println(x % 2 == 0)
    println("Is x an even number? $x")
    val areBothEven = x % 2 == 0 && y %2 == 0
    val areBothOdd = x % 2 == 0 || y %2 == 0
    println("Result is: $areBothEven")
    println("Result is: $areBothOdd")
    println()

    println("Please enter a number")
    val input = readln();
//    val inputAsInteger = input.toInt();
//    val inputAsInteger = input.toIntOrNull() ?: 0
//    val inputAsInteger = input.toIntOrNull()?.inc()
//    val isEven = inputAsInteger % 2 == 0
//    val inputAsInteger = input.toIntOrNull()?.rem(2)?.equals(0)
    val inputAsInteger = input.toIntOrNull()
//    if(inputAsInteger != null){
//        val output = if(inputAsInteger % 2 == 0){
//            "The number is even"
//        }else{
//            "The number is odd"
//        }
//        val isEven = inputAsInteger % 2 == 0
//        println("You have entered: $inputAsInteger")
//        println("Output is: $output")
//    }else{
//        println("Dude entered: $inputAsInteger")
//    }
//    println("You have entered: $inputAsInteger")
//    println("Is the number even: $isEven")

    if(inputAsInteger != null){
        val output = when{
            inputAsInteger % 2 == 0 -> "The number is even"
            inputAsInteger < 10 -> "The number is odd and less than 10"
            else -> "The number is add and at least 11"
        }
        println(output)

    }

    val output2 = when(inputAsInteger){
        null -> "Dude entered a valid number"
        3 -> "The number is three"
        5 -> "The number is five"
        in 10 .. 20 -> "The number is between 10 and 20"
        else -> "I have no idea what to print"
    }
    println(output2)
}