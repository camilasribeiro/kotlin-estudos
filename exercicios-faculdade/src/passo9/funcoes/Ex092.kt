package passo9.funcoes

fun main() {
    println("Digite um número: ")
    var numero = readln().toInt()

    parOuImpar(numero)
}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("O número $numero é par.")
    } else {
        println("O número $numero é ímpar.")
    }
}