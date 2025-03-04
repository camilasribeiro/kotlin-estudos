package passo2.condicoesbasicas

fun main() {
    print("Digite um número: ")
    val numero = readln().toInt()

    if (numero % 2 == 0) {
        println("O numero $numero é par")
    } else {
        println("O numero $numero é ímpar")
    }
}