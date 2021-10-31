
fun main(args: Array<String>) {

    println("Introduce la hora")
    var hora= readLine()?.toInt()
    println("¿Quieres introducir minutos y segundos? s/n")
    var guardado= readLine()
    if(guardado=="s"){
        println("Introduce el minuto")
        var minuto= readLine()?.toInt()

        println("Introduce el segundo")
        var segundo= readLine()?.toInt()

        val t1= Tiempo(hora!!, minuto!!, segundo!!)
        println(t1)
    }
    else{
        val t1= Tiempo(hora!!)
        println(t1)
    }



}
public class Tiempo {
    var hora:Int? = null
    var minuto:Int? = null
    var segundo:Int? = null
    public constructor( hora:Int, minuto:Int, segundo:Int){
        this.hora=hora
        this.minuto=minuto
        this.segundo=segundo
    }
    public constructor( hora:Int){
        this.hora=hora
    }
    public constructor( hora:Int, minuto: Int){
        this.hora=hora
        this.minuto=minuto
    }
    init {
        this.minuto=0
        this.segundo=0
    }

    override fun toString(): String =(""+hora+"h "+minuto+"m "+segundo+"s")
}
