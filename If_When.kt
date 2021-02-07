fun main(args: Array<String>){
    val numero = 2
    if (numero.equals(2)){
        println("Si son iguales")
    }else{
        println("No son iguales")
    }

    when(numero){
        in 1..5 -> println("Si esta entre del 1 al 5")
        in 1..3 -> println("Si esta entre del 1 al 3")
        !in 5..10 -> println("No no esta entre 5 y 10")
        else -> println("No no esta en alguno de los anteriores")
    }
}