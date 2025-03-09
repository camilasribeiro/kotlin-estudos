package passo2.condicoesbasicas

fun main() {
    print("Digite a distância que você pretende percorrer em Km: ")
    val distanciaKm = readln().toInt()

    if (distanciaKm > 200) {
        val precoPassagem = distanciaKm * 0.45
        println("Valor da passagem: R$${"%.2f".format(precoPassagem)}")
    } else {
        val precoPassagem = distanciaKm * 0.50
        println("Valor da passagem: R$${"%.2f".format(precoPassagem)}")
    }
}