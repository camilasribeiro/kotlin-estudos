package passo3.condicoescompostas

fun main() {
    val joKenPo = arrayOf("Pedra", "Papel", "Tesoura")

    val jogador1 = joKenPo.random()
    val jogador2 = joKenPo.random()

    Thread.sleep(1500)
    println("JO...")
    Thread.sleep(3000)
    println("KEN...")
    Thread.sleep(3000)
    println("PO...")
    Thread.sleep(1000)

    println("\nJogador 1: " + jogador1)
    println("Jogador 2: " + jogador2)

    val regras = mapOf(
        "Pedra" to "Tesoura",
        "Tesoura" to "Papel",
        "Papel" to "Pedra"
    )

    when {
        jogador1 == jogador2 -> println("\nEmpate!")
        regras[jogador1] == jogador2 -> println("\nJogador 1 ganhou!")
        else -> println("\nJogador 2 ganhou!!")
    }
}