package passo8.vetores

fun main() {
    var alunos = Array<Double>(10) {0.0}
    var posicoesMaiorNota = mutableListOf<Int>()
    var maiorNotaDigitada = Double.MIN_VALUE
    var alunosAcimaMedia = 0

    for (i in 0..9) {
        println("Digite a nota do aluno: ")
        var nota = readln().toDouble()
        alunos[i] = nota

        if (nota > maiorNotaDigitada) {
            maiorNotaDigitada = nota
            posicoesMaiorNota.clear()
            posicoesMaiorNota.add(i)
        } else if (nota == maiorNotaDigitada) {
            posicoesMaiorNota.add(i)
        }
    }

    var mediaTurma = alunos.average()

    for (nota in alunos) {
        if (nota > mediaTurma) {
            alunosAcimaMedia++
        }
    }

    println("Média da turma: ${"%.2f".format(mediaTurma)}")
    println("Quantidade de alunos acima da média da turma: $alunosAcimaMedia")
    println("Qual a maior nota digitada: $maiorNotaDigitada")
    println("Posição da maior nota: $posicoesMaiorNota")
}