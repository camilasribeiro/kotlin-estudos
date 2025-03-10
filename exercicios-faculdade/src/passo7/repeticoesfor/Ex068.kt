package passo7.repeticoesfor

fun main() {
    var mulheres = mutableListOf<Double>()
    var homens = mutableListOf<Double>()
    var homensAcima100Kg = 0

    for (i in 1..8) {
        println("Digite o sexo (M/F): ")
        var sexo = readln().uppercase()

        println("Digite o peso: ")
        var peso = readln().toDouble()

        if (sexo == "F") {
            mulheres.add(peso)
        } else if (sexo == "M"){
            homens.add(peso)
            if (peso > 100) {
                homensAcima100Kg++
            }
        } else {
            println("Entrada inválida! Digite apenas M ou F.")
            continue
        }
    }

    println("Quantidade de mulheres cadastradas: ${mulheres.size}")
    println("Quantidade de homens com mais de 100kg: $homensAcima100Kg")
    println("Média de peso entre as mulheres: ${"%.1f".format(mulheres.average())}")
    println("Maior peso entre os homens ${"%.1f".format(homens.max())}")
}