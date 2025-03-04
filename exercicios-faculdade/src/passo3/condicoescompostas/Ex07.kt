package passo3.condicoescompostas

import kotlin.random.Random

fun main() {
    val sorteioComputador = Random.nextInt(1, 6)

    print("Tente adivinhar qual número o computador escolheu (1 a 5): ")
    val numeroEscolhido = readln().toInt()

    if (numeroEscolhido == sorteioComputador){
        println("Parabéns, você acertou! O computador escolheu o número $sorteioComputador.")
    } else {
        println("Você errou. O computador escolheu o número $sorteioComputador.")
    }
}

//
//Crie um jogo onde o computador vai sortear um número
//entre 1 e 5 o jogador vai tentar descobrir qual foi o valor
//sorteado.