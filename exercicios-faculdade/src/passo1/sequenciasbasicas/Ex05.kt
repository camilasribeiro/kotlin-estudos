package passo1.sequenciasbasicas

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Nota 1: ")
    val nota1 : Double = scanner.nextDouble()

    print("Nota 2: ")
    val nota2: Double = scanner.nextDouble()

    val media : Double = (nota1 + nota2) / 2

    println("A média entre $nota1 e $nota2 é igual a $media")
}