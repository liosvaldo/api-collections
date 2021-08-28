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
}

