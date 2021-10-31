fun main(args: Array<String>) {

    val rec1= Rectangulo(1.0,4.0)
    println(rec1.Area())
    println(rec1.Perimetro())

    val rec2= Rectangulo(1.0,4.0)
    println(rec2.Area())
    println(rec2.Perimetro())
}
class Rectangulo (val base: Double,val altura:Double){

    fun Area(): Double =base*altura
    fun Perimetro(): Double= (2*altura)+(2*base)
}