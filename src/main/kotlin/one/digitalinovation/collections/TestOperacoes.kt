package one.digitalinovation.collections

fun main(){
    val salarios = doubleArrayOf( 1500.00, 2500.00, 5010.00)

    salarios.forEach {println(it)}

    println("O maior salario é ${salarios.maxOrNull()}")
    println("O menor salario é ${salarios.minOrNull()}")
    println("A media dos salarios é ${salarios.average()}")

    println("_____________________")
    val salarioMaiorQue = salarios.filter { it >=2500.00 }
    salarioMaiorQue.forEach{println(it)}

    println("___________________")
    println(salarios.count{it in 2000.0 .. 5000.00})

    println("___________________")
    println(salarios.find{it == 2500.0})

    println("___________________")
    println(salarios.find{it == 2550.0})

    println("___________________")
    println(salarios.any{it == 1000.0})

}

