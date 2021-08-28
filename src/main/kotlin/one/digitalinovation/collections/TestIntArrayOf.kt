package one.digitalinovation.collections

fun main(){

    val valores = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)

    for(valor in valores){
        println(valores)
    }

    valores.sort()
    valores.forEach(){
        println(it)
    }

}