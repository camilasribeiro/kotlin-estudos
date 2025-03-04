package passo1.sequenciasbasicas

fun main() {
    print("Quantos Km foram percorridos? ")
    val kmPercorridos = readln().toDouble()

    print("O carro foi alugado por quantos dias? ")
    val diasAluguel = readln().toInt()

    val precoKmPercorridos : Double = kmPercorridos * 0.20
    val precoDiasAluguel : Double = (90.0 * diasAluguel)

    val totalPagar : Double = precoDiasAluguel + precoKmPercorridos

    println("O carro foi alugado por $diasAluguel dias e percorreu ${kmPercorridos}Km")
    println("Você deverá pagar R$${"%.2f".format(precoKmPercorridos)} por Km percorridos")
    println("Você deverá pagar R$${"%.2f".format(precoDiasAluguel)} pela quantidade de dias que o carro foi alugado.")
    println("Total a pagar: R$${"%.2f".format(totalPagar)}")
}