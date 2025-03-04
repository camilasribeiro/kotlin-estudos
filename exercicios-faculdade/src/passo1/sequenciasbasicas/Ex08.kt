package passo1.sequenciasbasicas

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Digite uma distância em metros: ")
    val distanciaMetros : Double = scanner.nextDouble()

    val km : Double = distanciaMetros / 1000
    val hm : Double = distanciaMetros / 100
    val dam : Double = distanciaMetros / 10
    val dm : Double = distanciaMetros * 10
    val cm : Double = distanciaMetros * 100
    val mm : Double = distanciaMetros * 1000

    print("""
    A distância de ${distanciaMetros}m corresponde a:
    ${km}Km
    ${hm}Hm
    ${dam}Dam
 
    ${dm}dm
    ${cm}cm
    ${mm}mm
    """.trimIndent())
}