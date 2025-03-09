package passo3.condicoescompostas

fun main() {
    print("Peso: ")
    val peso = readln().toDouble()

    print("Altura: ")
    val altura = readln().toDouble()

    val iMC : Double = peso / (altura * altura)

    println("Peso: ${"%.1f".format(peso)}Kg")
    println("Altura: ${"%.2f".format(altura)}")
    println("IMC: ${"%.1f".format(iMC)}")

    when {
        iMC < 18.5 -> println("Abaixo do peso")
        iMC in 18.5..24.9 -> println("Peso ideal")
        iMC in 25.0..29.9 -> println("Sobrepeso")
        iMC in 30.0..39.9 -> println("Obesidade")
        else -> println("Obesidade mórbida")
    }
}