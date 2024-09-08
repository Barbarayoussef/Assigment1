
import java.util.Scanner//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val square =Square("Square")
    val circle =Circle("Circle")
    val triangle =Triangle("Triangle")
    val equilateralTriangle =EquilateralTriangle("EquilateralTriangle")

    println("please enter the height and the length of the square ")
    val reader = Scanner(System.`in`)
    val height = reader.nextDouble()
    val length = reader.nextDouble()
    square.setDimension(length, height)

    println("please enter the radius of the circle")
    val radius = reader.nextDouble()
    circle.setDimensions(radius)


    println("please enter the 3 sides of the triangle")
    val side1 = reader.nextDouble()
    val side2 = reader.nextDouble()
    val side3 = reader.nextDouble()
    triangle.setDimensions(side1, side2,side3)

    println("please enter the side of the equilateralTriangle")
    val side4 = reader.nextDouble()
    equilateralTriangle.setDimensions(side4)

    println("The ${circle.name} ${circle.printDimensions()} and its area = ${circle.getArea()}")
    println("The ${square.name} ${square.printDimensions()} and its area = ${square.getArea()}")
    println("The ${triangle.name} ${triangle.printDimensions()} and the area = ${triangle.getArea()}")
    println("The ${equilateralTriangle.name} ${equilateralTriangle.printDimensions()} and its area = ${equilateralTriangle.getArea()}")
}
