fun main(args: Array<String>){
    //Raw String
    //trimIndent() Nos permite imprimir un parrafo respetando la identacion que coloquemos
    val parrafo:String = """
    *** Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et 
    *** dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip 
    *** ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu 
    *** fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt 
    *** mollit anim id est laborum.
    """.trimIndent()
    println(parrafo)
    //trimMargin() Nos perite eliminar algun patron que veamos en nuestro String
    println(parrafo.trimMargin("*** "))
}