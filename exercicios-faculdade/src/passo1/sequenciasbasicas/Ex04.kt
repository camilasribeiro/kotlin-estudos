package passo1.sequenciasbasicas

fun main() {
    print("Digite um valor: ")
    val valor1 = readln().toInt()

    print("Digite outro valor: ")
    val valor2 = readln().toInt()

    val soma : Int = valor1 + valor2

    println("A soma entre $valor1 e $valor2 é igual a $soma")
}