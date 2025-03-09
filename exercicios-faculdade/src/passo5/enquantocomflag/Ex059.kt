package passo5.enquantocomflag

fun main() {
    var continuar = true

    var grupoMasculino = mutableListOf<Int>()
    var grupoFeminino = mutableListOf<Int>()

    while (continuar) {
        println("Digite o sexo ('M' para masculino e 'F' para feminino): ")
        var sexo = readln().uppercase()

        println("Digite a idade: ")
        var idade = readln().toInt()

        if (sexo == "M") {
            grupoMasculino.add(idade)
        } else {
            grupoFeminino.add(idade)
        }

        println("Deseja continuar? Digite 'S' para sim ou 'N' para não: ")
        var decisao = readln().uppercase()

        if (decisao == "N") {
            continuar = false
        }
    }

    var maiorIdade = (grupoFeminino + grupoMasculino).maxOrNull() ?: 0
    println("Maior idade: $maiorIdade")

    var homensCadastrados = grupoMasculino.size
    println("Quantidade de homens cadastrados: $homensCadastrados")

    var mulherMaisJovem = grupoFeminino.minOrNull() ?: 0
    println("Idade da mulher mais jovem: $mulherMaisJovem")

    var mediaIdade = grupoMasculino.average().toInt()
    println("Média de idade entre os homens: $mediaIdade")
}