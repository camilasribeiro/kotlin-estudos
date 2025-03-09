package passo4.repeticoes

fun main() {
    var pessoas = 0
    var mulheresCadastradas = 0
    var homensCadastrados = 0
    var mulheresMaisDe20Anos = 0
    val grupoPessoas = mutableListOf<Int>()
    val idadeHomens = mutableListOf<Int>()

    while (pessoas < 5) {
        print("Digite a idade: ")
        val idade = readln().toInt()

        print("Digite o sexo('M' ou 'F'): ")
        val sexo = readln().uppercase()

        grupoPessoas.add(idade)

        if (sexo == "M") {
            homensCadastrados += 1
            idadeHomens.add(idade)
        } else {
            mulheresCadastradas += 1
            if (idade > 20) {
                mulheresMaisDe20Anos += 1
            }
        }
        pessoas ++
    }
    println("Quantidade de homens cadastrados: $homensCadastrados")
    println("Quantidade de mulheres cadastradas: $mulheresCadastradas")
    println("Quantidade de mulheres com mais de 20 anos: $mulheresMaisDe20Anos")
    println("Média de idade do grupo: %.1f anos".format(grupoPessoas.average()))
    println("Média de idade dos homens: %.1f anos".format(idadeHomens.average()))
}