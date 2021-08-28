package one.digitalinovation.collections

fun main(){

    val joao = Funcionario("joao", 5000.00, "CLT")

    val pedro = Funcionario("pedro", 2000.00, "PJ")

    val maria = Funcionario("maria", 4000.00, "CLT")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach { println(it) }
    println("+++++++++++++++++++++++++++++")
    println(funcionarios.find{it.nome == "maria"})

    println("_____________________")
    funcionarios.sortedBy { it.salario }.forEach{println(it)}

    println("_____________________")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{println(it)}
}

data class Funcionario(

    val nome: String,
    val salario: Double,
    val tipoContratacao: String

){
    override fun toString(): String =
        """
            Nome: ${nome}
            Salario: ${salario}
        """.trimIndent()

}

