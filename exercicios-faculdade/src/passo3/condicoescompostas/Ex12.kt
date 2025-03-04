package passo3.condicoescompostas

fun main() {
    print("Salário: R$")
    val salario = readln().toDouble()

    print("Gênero ('F' para Feminino ou 'M' para Masculino): ")
    val genero = readln().uppercase()

    print("Tempo de empresa: ")
    val tempoEmpresa = readln().toInt()

    println("Salário R$${"%.2f".format(salario)}")
    println("Gênero: $genero")
    println("Tempo de empresa: $tempoEmpresa anos")

    val aumento = when {
        genero == "M" && tempoEmpresa < 20 -> salario * 0.03
        genero == "M" && tempoEmpresa in 20..30 -> salario * 0.13
        genero == "M" && tempoEmpresa > 30 -> salario * 0.25
        genero == "F" && tempoEmpresa < 15 -> salario * 0.05
        genero == "F" && tempoEmpresa in 15..20 -> salario * 0.12
        genero == "F" && tempoEmpresa > 20 -> salario * 0.23
        else -> 0.0
    }

    val salarioAjustado = salario + aumento

    println("Salário Atualizado: R$${"%.2f".format(salarioAjustado)}")
}