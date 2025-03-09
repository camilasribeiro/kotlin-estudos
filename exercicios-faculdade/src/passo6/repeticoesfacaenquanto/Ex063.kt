package passo6.repeticaofacaenquanto

fun main() {
    var soma = 0
    var pares = 0
    var numeros = mutableListOf<Int>()
    var continuar = true
    do {
        println("Digite um número: ")
        var numero = readln().toInt()

        numeros.add(numero)
        soma += numero

        if (numero % 2 == 0) {
            pares++
        }

        print("Quer continuar? (S ou N): ")
        var decisao = readln().uppercase()

        if (decisao == "N") {
            continuar = false
        }

    } while (continuar)

        println("Soma de todos os números: $soma")
        println("Menor valor digitado: ${numeros.minOrNull() ?: "Nenhum número digitado"}")
        println("Média entre todos os valores: ${"%.1f".format(numeros.average())}")
        println("Quantidade de valores pares: $pares")
}