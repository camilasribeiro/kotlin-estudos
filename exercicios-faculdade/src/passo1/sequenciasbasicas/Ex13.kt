package passo1.sequenciasbasicas

fun main() {
    print("Salário do funcionário: R$")
    val salario = readln().toDouble()

    val aumento = (salario / 100) * 15
    val salarioComAumento = salario + aumento

    print("O salário de R$${"%.2f".format(salario)} teve aumento de 15% e passou a ser R$${"%.2f".format(salarioComAumento)}")
}