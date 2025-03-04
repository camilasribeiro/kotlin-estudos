package passo1.sequenciasbasicas

fun main() {
    print("Preço do produto: R$")
    val precoProduto = readln().toDouble()

    val desconto = (precoProduto / 100) * 5
    val precoPromocional = precoProduto - desconto

    println("O produto de R$${"%.2f".format(precoProduto)} teve desconto de 5% e agora custa R$${"%.2f".format
        (precoPromocional)}")
}