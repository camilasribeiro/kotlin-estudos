package passo1.sequenciasbasicas

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Digite um número inteiro: ")
    val numero = scanner.nextInt()
    val numeroAntecessor : Int = numero - 1
    val numeroSucessor : Int = numero + 1

    print("""
        Número: $numero
        Sucessor: $numeroSucessor
        Antecessor: $numeroAntecessor
    """.trimIndent())
}