package passo1.sequenciasbasicas

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Digite um número: ")
    val numero : Double = scanner.nextDouble()

    val dobro = numero * 2
    val tercaParte = numero / 3

    println("Número: $numero")
    println("O dobro de $numero é $dobro")
    println("A terça parte de $numero é $tercaParte")
}