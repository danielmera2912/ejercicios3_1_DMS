import java.util.*

fun main(args: Array<String>) {
    try{
        val p1= Persona()
        val c1= Cuenta("1",0.0f)
        val c2= Cuenta("2",700.0f)
        p1.incorporarCuenta(c1)
        p1.incorporarCuenta(c2)
        p1.cuentas[0]?.recibirAbono(1100.0f)
        p1.cuentas[1]?.realizarCargo(750.0f)
        Cuenta.isMorosa(p1)
        p1.cuentas[0]?.realizarCargo(50.0f)
        p1.cuentas[1]?.recibirAbono(50.0f)
    }catch (e: Exception){
        
    }

}
class Cuenta(val numCuenta: String, var saldoDisponible:Float=0.0f){
companion object{
    fun isMorosa(persona: Persona){
        var contador=0
        for(i in 0..persona.cuentas.size){
            if(persona.cuentas[i]?.consultarSaldo()!! <0){
            }
            else{
                contador=contador+1
            }
        }
        if(contador==persona.cuentas.size){
            println("No es morosa")
        }
        else{
            println("Es morosa")
        }
    }
}
    fun recibirAbono(abono: Float){
        saldoDisponible= (saldoDisponible+abono).toFloat()
    }
    fun realizarCargo(cargo: Float){
        saldoDisponible= (saldoDisponible-cargo).toFloat()
    }
    fun consultarSaldo(): Float{
        return saldoDisponible
    }
}
class Persona(var cuentas: Array<Cuenta?> = arrayOfNulls(3)){
    init {
        var dni: String= UUID.randomUUID().toString()
    }

    fun incorporarCuenta(cuenta: Cuenta){
        cuentas+=cuenta
    }

}