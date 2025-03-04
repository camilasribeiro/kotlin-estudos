package passo1.sequenciasbasicas

fun main() {
    print("Nome do Funcionário: ")
    val nomeFuncionario : String = readln()

    print("Salário: R$")
    val salarioFuncionario : Double = readln().toDouble()

    print("O funcionário $nomeFuncionario tem um salário de R$%.2f.".format(salarioFuncionario))
}