package passo4.repeticoes

fun main() {
    val sorteioComputador = (1..10).random()
    var tentativas = 4

    println("Bem-vindo ao jogo de adivinhação!")
    println("O computador escolheu um número entre 1 e 10.")
    println("Você tem $tentativas tentativas para adivinhar o número escolhido.")

    while (tentativas > 0) {
        println("\nDigite seu palpite: ")
        val numeroEscolhido = readln().toInt()

        if (numeroEscolhido == sorteioComputador){
            println("Parabéns, você acertou! O computador escolheu o número $sorteioComputador.")
            break
        } else {
            tentativas -= 1

            if (numeroEscolhido < sorteioComputador) {
                println("Seu palpite é menor que o número sorteado.")
            } else {
                println("Seu palpite é maior que o número sorteado.")
            }

            if (tentativas > 0) {
                println("Você ainda tem $tentativas tentativas")
            } else {
                println("Fim de jogo. O número era $sorteioComputador.")
            }
        }
    }
}