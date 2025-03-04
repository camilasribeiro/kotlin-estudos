package passo1.sequenciasbasicas

fun main() {
    print("Digite o valor de A: ")
    val valorA = readln().toInt()

    print("Digite o valor de B: ")
    val valorB = readln().toInt()

    print("Digite o valor de C: ")
    val valorC = readln().toInt()

    val delta = (valorB * valorB) - 4 * (valorA * valorC)
    println("Valor de A: $valorA")
    println("Valor de B: $valorB")
    println("Valor de C: $valorC")
    println("Delta: $delta")
}