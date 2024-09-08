import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    private var Side1: Double = 0.0
    private var Side2: Double = 0.0
    private var Side3: Double = 0.0
    override fun printDimensions() : String{
       return "first side = $Side1 and the second side  = $Side2 and the third side = $Side3 "
    }
    fun setDimensions(_side1: Double, _side2: Double, _side3: Double) {
        Side1 = _side1
        Side2 = _side2
        Side3 = _side3
    }


   override fun getArea():Double{
        val s= (Side1 + Side2 + Side3)/2.0
        return sqrt(s * (s - Side1) * (s - Side2) * (s - Side3))
    }
}