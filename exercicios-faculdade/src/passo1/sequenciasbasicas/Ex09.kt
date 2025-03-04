package passo1.sequenciasbasicas

fun main() {
    val valorDolar = 3.45

    print("Digite o valor que você tem na carteira: R$")
    val valorCarteira = readln().toDouble()

    val conversaoDolar = valorCarteira / valorDolar

    print("Você tem R$%.2f na carteira e pode comprar US$%.2f".format(valorCarteira, conversaoDolar))
}