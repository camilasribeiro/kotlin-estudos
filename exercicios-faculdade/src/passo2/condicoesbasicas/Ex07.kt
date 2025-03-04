package passo2.condicoesbasicas

fun main() {
    print("Digite seu nome: ")
    val nome = readln()

    print("Qual é seu sexo? Digite 'F' para feminino ou 'M' para masculino:  ")
    val sexo = readln()

    print("Qual o valor da compra? R$")
    val valorCompra = readln().toDouble()

    val descontoSexoM = (valorCompra / 100) * 5
    val descontoSexoF = (valorCompra / 100) * 13

    if (sexo == "M") {
        val valorCompraComDesconto = valorCompra - descontoSexoM
        println("$nome, você ganhou 5% de desconto. Sua compra ficou no valor de R$${"%.2f".format(valorCompraComDesconto)}")
    } else {
        val valorCompraComDesconto = valorCompra - descontoSexoF
        println("$nome, feliz Dia da Mulher! Você ganhou 13% de desconto e sua compra ficou no valor de R$${"%.2f".format(valorCompraComDesconto)}")
    }
}