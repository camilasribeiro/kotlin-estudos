package passo4.repeticoes

import kotlin.math.min

fun main() {

    val precosProdutos = mutableListOf<Double>()

    for (i in 1..8) {
        print("Digite o preço do ${i}º produto: R$")
        val precoProduto = readln().toDouble()
        precosProdutos.add(precoProduto)
    }
    val menorPreco = precosProdutos.minOrNull() ?: 0.0
    val maiorPreco = precosProdutos.maxOrNull() ?: 0.0

    println("Maior preço: ${"%.2f".format(maiorPreco)}")
    println("Menor preço: ${"%.2f".format(menorPreco)}")
}