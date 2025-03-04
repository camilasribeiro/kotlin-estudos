package passo1.sequenciasbasicas

fun main() {
    print("Dias trabalhados no mês: ")
    val diasTrabalhadosMes = readln().toInt()

    val valorDiaTrabalhado = 8 * 25
    val salario = diasTrabalhadosMes * valorDiaTrabalhado

    print("Salário: R$${"%.2f".format(salario.toDouble())}")
}