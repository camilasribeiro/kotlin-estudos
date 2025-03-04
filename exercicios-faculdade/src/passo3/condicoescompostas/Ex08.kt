package passo3.condicoescompostas

fun main() {
    print("Valor da casa: R$")
    val valorCasa = readln().toDouble()

    print("Salário comprador: R$")
    val salarioComprador = readln().toDouble()

    print("Tempo de financiamento: ")
    val tempoFinanciamento = readln().toInt()

    val prestacaoMensal = valorCasa / (tempoFinanciamento * 12)
    println("Valor da mensalidade: R$${"%.2f".format(prestacaoMensal)}")

    if (prestacaoMensal > ((salarioComprador / 100) * 30)) {
        println("Empréstimo negado. O valor da mensalidade excedeu 30% do seu salário!")
    } else {
        println("Empréstimo aprovado.")
    }
}