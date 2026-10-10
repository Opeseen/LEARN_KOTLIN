import kotlin.math.PI
import kotlin.math.sqrt
import kotlin.text.isLetter

fun main() {
    val rec1 = Rectangle(
        width = 5f,
        height = 7f
    )

    val rec2 = Rectangle(
        width = 9f,
        height = 7f
    )

    println(rec1 == rec2)
    println(rec1.width)
    println(rec1.height)
    println("The diagonal is ${rec1.diagonal}")
    println("Yhe area is ${rec1.area}")
    println(rec1)
    println(rec1.copy(width = 2f))
    println(rec1.maxArea(rec1, rec2))

    val circle = Circle(radius = 5f)
    println(circle.area)

    println(rec1.area)

    println(sumAreas(rec1, circle))

}

interface Shape{
    val area: Float
    val circumference: Float
}

data class Rectangle(val width: Float, val height: Float): Shape{
    val diagonal = sqrt(width * width + height * height)
    override val area = width * height

    override val circumference get() = 2 * width * height

    fun maxArea(rect1: Rectangle, rect2: Rectangle): Float{
        val area1 = rect1.area
        val area2 = rect2.area

        return maxOf(area1, area2)
    }
}

data class Rectangle2(val width: Float, val height: Float){
    val diagonal = sqrt(width * width + height * height)
    val area = width * height

    fun maxArea(rect1: Rectangle, rect2: Rectangle): Float{
        val area1 = rect1.area
        val area2 = rect2.area

        return maxOf(area1, area2)
    }
}


data class Circle(val radius: Float): Shape{
    override val area = radius * radius * PI.toFloat()
    override val circumference = 2 * radius * PI.toFloat()
    val diameter = 2 * radius
}

fun sumAreas(vararg shapes: Shape): Double{
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}