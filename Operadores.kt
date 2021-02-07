fun main(args: Array<String>){
    println(1 + 1)
    println(3 - 1)
    println(2 * 2)
    println(4 / 2)
    println(7 % 2)
    val a = 4
    val b = 2
    //Equivalente a la suma
    println("la Suma de 4 + 2 es: " + a.plus(b))
    //Equivalente a la resta
    println("La resta de 4 - 2 es: " + a.minus(b))
    //Equivalente a la multiplicacion
    println("La multiplicacion de 4 * 2 es:" + a.times(b))
    //Equivalente a la division
    println("La division de 4 / 2 es:" + a.div(b))
    //Equivalente al modulo
    println("El Modulo de 4 % 2 es:" + a.rem(b))
}