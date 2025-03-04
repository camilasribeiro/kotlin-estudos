package passo3.condicoescompostas

fun main() {
    print("Tipo de carro alugado: ")
    val carroAlugado = readln()

    print("Quantidade de dias: ")
    val diasAlugado = readln().toInt()

    print("Km percorridos: ")
    val kmPercorridos = readln().toInt()

    val valorAluguelCarroPopular = 90 * diasAlugado
    val valorAluguelCarroLuxo = 150 * diasAlugado

    if (carroAlugado == "Popular"){
        if (kmPercorridos > 100) {
            val precoKm = kmPercorridos * 0.10
            val precoTotal = valorAluguelCarroPopular + precoKm
            println("Total a pagar: R$${"%.2f".format(precoTotal)}")
        } else {
            val precoKm = kmPercorridos * 0.20
            val precoTotal = valorAluguelCarroPopular + precoKm
            println("Total a pagar: R$${"%.2f".format(precoTotal)}")
        }
    } else {
        if (kmPercorridos > 200) {
            val precoKm = kmPercorridos * 0.25
            val precoTotal = valorAluguelCarroLuxo + precoKm
            println("Total a pagar: R$${"%.2f".format(precoTotal)}")
        } else {
            val precoKm = kmPercorridos * 0.30
            val precoTotal = valorAluguelCarroLuxo + precoKm
            println("Total a pagar: R$${"%.2f".format(precoTotal)}")
        }
    }
}