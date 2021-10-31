import java.util.*

fun main(args: Array<String>) {
    try{
        val l1= Libro("1","Juan",200,10)
        val l2= Libro("2","Peter",200,10)
        val cLibros= conjuntoLibros()
        cLibros.incorporarLibro(l1)
        cLibros.incorporarLibro(l2)
        cLibros.eliminarLibroAutor("Juan")
        cLibros.eliminarLibroTitulo("2")
        cLibros.incorporarLibro(l1)
        cLibros.incorporarLibro(l2)
        print(l1.toString())
    }catch (e: Exception){

    }

}

class Libro(var titulo:String="", var autor:String, val nPaginas:Int, var calificacion: Int){


}
class conjuntoLibros(){
    var libros: Array<Libro?> = arrayOfNulls(10)
    fun eliminarLibroTitulo(titulo: String){
        for(i in 0..libros.size){
            if(libros[i]?.titulo.toString()==titulo){
                libros[i]==null
            }
        }
    }
    fun eliminarLibroAutor(autor: String){
        for(i in 0..libros.size){
            if(libros[i]?.autor.toString()==autor){
                libros[i]==null
            }
        }
    }
    fun mayorCalif(){
        for(i in 0..libros.size){
            var mayor=0
            var guardado=0
            var num= libros[i]?.calificacion
            if (num != null) {
                if(num>=mayor){
                    mayor=num
                    guardado=i
                }
            }
        print("El libro mayor es "+libros[guardado]+" con una calificación de "+mayor)
        }
    }
    fun menorCalif(){
        for(i in 0..libros.size){
            var menor=0
            var guardado=0
            var num= libros[i]?.calificacion
            if (num != null) {
                if(num<=menor){
                    menor=num
                    guardado=i
                }
            }
            print("El libro menor es "+libros[guardado]+" con una calificación de "+menor)
        }
    }
    fun incorporarLibro(libro: Libro){
        libros+=libro
    }
    override fun toString(): String =(""+libros)
}
