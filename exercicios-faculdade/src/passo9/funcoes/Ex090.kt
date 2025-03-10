package passo9.funcoes

fun main() {
    println("Digite o primeiro número: ")
    val primeiroNumero = readln().toInt()

    println("Digite o segundo número: ")
    val segundoNumero = readln().toInt()

    soma(primeiroNumero, segundoNumero)
}

fun soma(valor1: Int, valor2: Int) {
    val soma = valor1 + valor2
    println("A soma entre $valor1 e $valor2 é $soma")
}