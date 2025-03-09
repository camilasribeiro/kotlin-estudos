package passo5.enquantocomflag

fun main() {
    var continuar = true

    var nomes = mutableListOf<String>()
    var idades = mutableListOf<Int>()
    var sexos = mutableListOf<String>()

    var homensMaisDe30 = 0
    var mulheresMenos18 = 0

    var nomeMulherMaisNova = ""
    var idadeMulherMaisNova = Int.MAX_VALUE

    var nomePessoaMaisVelha = ""
    var idadePessoaMaisVelha = Int.MIN_VALUE

    while (continuar) {
        println("Digite o nome: ")
        var nome = readln()

        println("Digite a idade: ")
        var idade = readln().toInt()

        println("Digite o sexo ('M' para masculino e 'F' para feminino): ")
        var sexo = readln().uppercase()

        nomes.add(nome)
        idades.add(idade)
        sexos.add(sexo)

        if (idade > idadePessoaMaisVelha) {
            nomePessoaMaisVelha = nome
            idadePessoaMaisVelha = idade
        }

        if (sexo == "F" && idade < idadeMulherMaisNova) {
            idadeMulherMaisNova = idade
            nomeMulherMaisNova = nome
        }

        if (sexo == "M" && idade > 30) {
            homensMaisDe30 ++
        } else if (sexo == "F" && idade < 18){
            mulheresMenos18 ++
        }

        println("Deseja continuar? Digite 'S' para sim ou 'N' para não: ")
        var decisao = readln().uppercase()

        if (decisao == "N") {
            continuar = false
        }
    }

    val mediaIdade = idades.average()

    println("Nome da pessoa mais velha: $nomePessoaMaisVelha")
    println("O nome da mulher mais jovem: $nomeMulherMaisNova")
    println("Média de idade do grupo ${"%.1f".format(mediaIdade)}")
    println("Quantidade de homens com mais de 30 anos: $homensMaisDe30")
    println("Quantidade de mulheres com menos de 18 anos: $mulheresMenos18")
}