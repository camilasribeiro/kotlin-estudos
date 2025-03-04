package passo2.condicoesbasicas

import java.time.LocalDate
import kotlin.math.absoluteValue

fun main() {
    print("Digite seu ano de nascimento: ")
    val anoNascimento = readln().toInt()

    val idade = LocalDate.now().year - anoNascimento
    val anosAlistamento = (idade - 18).absoluteValue

    if (idade > 18) {
        if (anosAlistamento == 1) {
            println("Você tem $idade anos. Já se passou $anosAlistamento do alistamento militar!")
        } else {
            println("Você tem $idade anos. Já se passaram $anosAlistamento do alistamento militar!")
        }
    } else if (idade == 18) {
        println("Você tem $idade anos. Está na hora de se alistar!")
    } else {
        if (anosAlistamento == 1) {
            println("Você tem $idade anos. Falta $anosAlistamento ano para o alistamento militar!")
        } else {
            println("Você tem $idade anos. Faltam $anosAlistamento anos para o alistamento militar!")
        }
    }
}