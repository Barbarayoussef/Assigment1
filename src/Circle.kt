import kotlin.math.PI

class Circle(_name: String) : Shape(_name) {
     private var radius: Double = 0.0
    override fun printDimensions() : String {
       return "radius = $radius"
    }
    fun setDimensions(_radius:Double) {
        radius = _radius

    }

    override fun getArea(): Double = PI * radius * radius

}