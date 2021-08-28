package one.digitalinovation.collections

fun main(){
    val valores = IntArray(5)
    valores[0] = 1
    valores[1] = 3
    valores[2] = 5
    valores[3] = 7
    valores[4] = 9

    for(valor in valores){
        println(valor)
    }
    println("__________________________")
    valores.forEach{
        println(it)
    }
    println("________________________")
    valores.forEach{ valor ->
        println(valor)
    }

}