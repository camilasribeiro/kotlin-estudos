package passo10.funcoes

fun main() {
    println("Digite a base: ")
    val base = readln().toInt()

    println("Digite o expoente: ")
    val expoente = readln().toInt()

    val resultado = potencia(base, expoente)

    println("$base^$expoente = $resultado")
}

fun potencia(base: Int, expoente: Int): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}