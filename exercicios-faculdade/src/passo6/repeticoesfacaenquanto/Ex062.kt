package passo6.repeticaofacaenquanto

fun main() {
    var continuar = true
    var pessoasCom21AnosOuMais = 0
    var idades = mutableListOf<Int>()

    do {
        println("Digite a idade: ")
        var idade = readln().toInt()

        idades.add(idade)

        if (idade >= 21) {
            pessoasCom21AnosOuMais ++
        }

        print("Quer continuar? (S ou N): ")
        var decisao = readln().uppercase()

        if (decisao == "N") {
            continuar = false
        }
    } while (continuar)
    println("Quantidade de idades digitadas: ${idades.size}")
    println("Média das idades digitadas ${"%.1f".format(idades.average())}")
    println("Quantidade de pessoas com 21 anos ou mais: $pessoasCom21AnosOuMais")
}