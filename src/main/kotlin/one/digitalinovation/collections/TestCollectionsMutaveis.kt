package one.digitalinovation.collections

fun main(){
    val joao = Funcionario("joao", 5000.00, "CLT")

    val pedro = Funcionario("pedro", 2000.00, "PJ")

    val maria = Funcionario("maria", 4000.00, "CLT")

    println("_----------------------------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("-----------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("-----------------------------")
    funcionarios.remove(maria)
    funcionarios.forEach{println(it)}

    println("-------------SET----------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{println(it)}

    println("-----------------------------")
    funcionariosSet.add(maria)
    funcionariosSet.add(pedro)
    funcionariosSet.forEach{println(it)}


    println("-----------------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}

}