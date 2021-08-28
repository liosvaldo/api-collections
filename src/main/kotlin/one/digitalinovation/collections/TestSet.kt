package one.digitalinovation.collections

fun main(){
    val joao = Funcionario("joao", 5000.00, "CLT")

    val pedro = Funcionario("pedro", 2000.00, "PJ")

    val maria = Funcionario("maria", 4000.00, "CLT")

    val conjuntosFuncionarios1 = setOf(joao, pedro)
    val conjuntosFuncionarios2 = setOf(maria)

    val resultadoUniao = conjuntosFuncionarios1.union(conjuntosFuncionarios2)
    resultadoUniao.forEach{println(it)}

    println("____________________________")
    val conjuntosFuncionarios3 = setOf(joao, pedro, maria)

    val resultadosubtract = conjuntosFuncionarios3.subtract(conjuntosFuncionarios1)
    resultadosubtract.forEach{println(it)}

    println("____________________________")

    val resultadointersect = conjuntosFuncionarios3.intersect(conjuntosFuncionarios1)
    resultadointersect.forEach{println(it)}


}