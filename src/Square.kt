class Square(_name: String) : Shape(_name) {
    private  var length: Double = 0.0
    private var height: Double = 0.0

    fun setDimension(_height: Double, _length:Double){
        height = _height
        length = _length
    }


    override fun printDimensions() : String {
      return "height = $height and the length = $length"
    }

    override fun getArea(): Double =height*length



}