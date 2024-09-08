import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {
    private var Sidde1 : Double = 0.0

    fun setDimensions(_sidde1 : Double) {
        Sidde1 = _sidde1
    }

    override fun printDimensions() : String {
     return "The side = $Sidde1"
    }

    override fun getArea():Double= (sqrt(3.0)/4) * Sidde1 * Sidde1


}