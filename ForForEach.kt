fun main(args: Array<String>) {
    var daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")

    for (day in daysOfWeek){
        println(day)
    }

    for ((indice,day) in daysOfWeek.withIndex()){
        println(" $indice: $day")
    }

    daysOfWeek.forEach {
        println(" ForEach: $it")
    }
}