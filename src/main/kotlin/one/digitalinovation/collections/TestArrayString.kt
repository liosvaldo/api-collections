package one.digitalinovation.collections

fun main(){
    val nomes = Array(3){""}

    nomes[0] = "joao"
    nomes[1] = "maria"
    nomes[2] = "jose"

    for(nome in nomes){
        println(nome)
    }

    nomes.sort()
    nomes.forEach{
        println(it)
    }

    println("__________________")

    val nomes2 = arrayOf("maria", "jose", "bruno")

    nomes2.forEach{println(it)}
}