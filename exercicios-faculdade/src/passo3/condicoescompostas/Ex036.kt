package passo3.condicoescompostas

fun main() {
    print("Horas de atividade física: ")
    val horasAtividade = readln().toInt()

    var pontos = 0

    when {
        horasAtividade < 10 -> pontos += 2 * horasAtividade
        horasAtividade in 10..20 -> pontos += 5 * horasAtividade
        horasAtividade > 20 -> pontos += 10 * horasAtividade
    }

    val receberValor = pontos * 0.05

    println("Horas de atividade: $horasAtividade horas.")
    println("Total de pontos: $pontos pontos")
    println("Valor ganho: R$${"%.2f".format(receberValor)}")
}