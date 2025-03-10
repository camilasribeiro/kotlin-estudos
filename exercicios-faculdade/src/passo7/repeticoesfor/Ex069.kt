package passo7.repeticoesfor

fun main() {
    println("Digite o valor do primeiro termo: ")
    var primeiroTermo = readln().toInt()

    println("Digite a razão de uma Progressão Aritmética: ")
    var razao = readln().toInt()

    val a1 = primeiroTermo
    println("a1 = $a1")

    var a2 = primeiroTermo + razao
    println("a2 = $primeiroTermo + $razao = ${a2}")

    var soma = (a1 + (a2))

    var sequencia = mutableListOf<Int>(a1, a2)

    for (i in 3..10) {
        var calculo = (a1 + (razao * (i - 1)))
        soma += calculo
        sequencia.add(calculo)

        println("a$i = $a1 + $razao x ${i - 1} = ${calculo}")
        print("")
    }
    print("\nSequência: ")
    for (i in sequencia) {
        print("$i ")
    }

    println("\nA soma de todos os valores da sequência é: $soma")
}