package passo5.enquantocomflag

fun main() {
    var quantidadeAlunos = 0
    var continuar = true
    var mediaIdade = mutableListOf<Int>()

    while (continuar) {
        println("Digite a idade de um aluno: ")
        var idade = readln().toInt()

        if(idade == 999) {
            continuar = false
        } else {
            mediaIdade.add(idade)
            quantidadeAlunos++
        }
    }
    println("Quantidade de alunos: $quantidadeAlunos")
    println("Média de idade: ${mediaIdade.average().toInt()}")
}