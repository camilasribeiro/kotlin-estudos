package passo3.condicoescompostas

fun main() {
    print("Nome do funcionário: ")
    val nomeFuncionario = readln()

    print("Salário do funcionário: R$")
    val salarioFuncionario = readln().toDouble()

    print("Há quantos anos trabalha na empresa? ")
    val anosNaEmpresa = readln().toInt()

    println("Nome funcionário: $nomeFuncionario")
    println("Tempo de empresa: ${anosNaEmpresa} anos")

    if (anosNaEmpresa >= 10) {
        val novoSalario = salarioFuncionario + ((salarioFuncionario / 100) * 20)
        println("Aumento: 20%")
        println("Salário atualizado: R$${"%.2f".format(novoSalario)}")
    } else if (anosNaEmpresa <= 3) {
        val novoSalario = salarioFuncionario + ((salarioFuncionario / 100) * 3)
        println("Aumento: 3%")
        println("Salário atualizado: R$${"%.2f".format(novoSalario)}")
    } else {
        val novoSalario = salarioFuncionario + ((salarioFuncionario / 100) * 12.5)
        println("Aumento: 12.5%")
        println("Salário atualizado: R$${"%.2f".format(novoSalario)}")
    }
}