package one.digitalinovation.collections

fun main(){
    val joao = Funcionario("joao", 5000.00, "CLT")

    val pedro = Funcionario("pedro", 2000.00, "PJ")

    val maria = Funcionario("maria", 4000.00, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

}