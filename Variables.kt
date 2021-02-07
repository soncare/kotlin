const val Pi = 3.14
fun main(args: Array<String>){
    val name = args[0]  //Tiempo de ejecucion
    println(name)
    println(Pi)

    //Strings en Kotlin
    val nombre = "Carlos"
    val apellido:String = "Repillosa"
    val nombreApellido = nombre + '\n' + apellido
    println("Tu nombre es: $nombre $apellido")
    println("Tu nombre es: $nombreApellido")
}