package passo10.funcoes

fun main() {
    println("Digite o primeiro número: ")
    val numero1 = readln().toInt()

    println("Digite o segundo número: ")
    val numero2 = readln().toInt()

    println("Digite o terceiro número: ")
    val numero3 = readln().toInt()

    maior(numero1, numero2, numero3)
}

fun maior(numero1: Int, numero2: Int, numero3: Int) {
    val maior = if (numero1 >= numero2 && numero1 >= numero3) {
        numero1
    } else if (numero2 >= numero1 && numero2 >= numero3) {
        numero2
    } else {
        numero3
    }

    if (numero1 == numero2 && numero2 == numero3) {
        println("Os três números são iguais!")
    } else {
        println("O maior número é: $maior")
    }
}