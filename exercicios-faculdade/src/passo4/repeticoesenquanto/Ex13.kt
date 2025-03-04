package passo4.repeticoesenquanto

import kotlin.random.Random

fun main() {
    var numerosAcimaDe5 = 0
    var numerosDivisiveisPor3 = 0

    print("Números sorteados: ")
    for (i in 1..20) {
        val numeroSorteado = Random.nextInt(1, 11)
        if (i < 20) {
            print("$numeroSorteado - ")
        } else {
            print("$numeroSorteado")
        }

        if (numeroSorteado > 5) {
            numerosAcimaDe5 += 1
        }
        if (numeroSorteado % 3 == 0) {
            numerosDivisiveisPor3 += 1
        }
    }
    println("\nQuantidade de números acima de 5: $numerosAcimaDe5")
    println("Quantidade de números divisíveis por 3: $numerosDivisiveisPor3")
}