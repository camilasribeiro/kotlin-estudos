package passo2.condicoesbasicas

import java.time.LocalDate

fun main() {
    print("Digite seu ano de nascimento: ")
    val anoNascimento = readln().toInt()
    val idade = LocalDate.now().year - anoNascimento
    if (idade >= 18) {
        println("Você tem $idade e já pode votar!")
    } else {
        println("Você tem $idade e ainda não pode votar!")
    }
}