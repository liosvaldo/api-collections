package one.digitalinovation.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 10000.00
    salarios[1] = 20000.00
    salarios[2] = 500.00

    salarios.forEach{println(it)}

    println("____________________")
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }


    val salarios2 = doubleArrayOf( 1500.00, 2500.00, 5010.00)

    salarios2.sort()
    salarios2.forEach {println(it)}


}