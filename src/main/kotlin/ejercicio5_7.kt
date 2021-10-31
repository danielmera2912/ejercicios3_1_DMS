import java.util.*

fun main(args: Array<String>) {

    val coche1= Coche("123","123",4,2,"123456")
    val coche2= Coche("523","123",4,2,"523456")
    coche1.color="rojo"
    println(coche1)

    coche2.color="verde"
    println(coche2)
}
class Coche (val marca:String, val modelo:String, val caballos:Int, val puertas: Int, var matricula:String){
    var color: String= ""
    get() = field
    set(value){
        field=value
    }
/*
    init {
        matricula= UUID.randomUUID().toString()
    }

 */
    override fun toString(): String =("El coche es de color "+color+", su marca es "+marca+", su modelo es "+modelo+", su número de caballos es "+caballos+", su número de puertas es "+puertas+" y su matrícula es "+matricula)
    /*
    fun infoCoche(){
        print("El coche es de color "+color+", su marca es "+marca+", su modelo es "+modelo+", su número de caballos es "+caballos+", su número de puertas es "+puertas+" y su matrícula es "+matricula)
    }
*/

}