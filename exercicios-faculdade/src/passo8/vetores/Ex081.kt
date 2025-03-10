package passo8.vetores

fun main() {
    var idades = Array<Int> (8) {0}
    var maiorIdadeDigitada = Int.MIN_VALUE
    var posicoesMaiorIdade = mutableListOf<Int>()

    for (i in 0..7) {
        println("Digite a idade: ")
        var idade = readln().toInt()
        idades[i] = idade

        if (idade > maiorIdadeDigitada) {
            maiorIdadeDigitada = idade
            posicoesMaiorIdade.clear()
            posicoesMaiorIdade.add(i)
        } else if (idade == maiorIdadeDigitada) {
            posicoesMaiorIdade.add(i)
        }
    }

    println("Posição das pessoas com mais de 25 anos: ")
    for (i in idades.indices) {
        if (idades[i] > 25) {
            println("Índice $i: ${idades[i]}")
        }
    }
    println("Idade média das pessoas cadastradas: ${"%.1f".format(idades.average())}")
    println("\nA maior idade digitada foi: $maiorIdadeDigitada")
    println("Ela foi digitada nas posições: $posicoesMaiorIdade")
}