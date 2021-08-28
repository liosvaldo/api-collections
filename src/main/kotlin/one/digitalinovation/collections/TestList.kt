package one.digitalinovation.collections

fun main(){

    val joao = Funcionario("joao", 1000.00)

    val pedro = Funcionario("pedro", 2000.00)

    val maria = Funcionario("maria", 4000.00)

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach { println(it) }
    println("+++++++++++++++++++++++++++++")
    println(funcionarios.find{it.nome == "maria"})
}

data class Funcionario(

    val nome: String,
    val salario: Double

){
    override fun toString(): String =
        """
            Nome: ${nome}
            Salario: ${salario}
        """.trimIndent()

}

