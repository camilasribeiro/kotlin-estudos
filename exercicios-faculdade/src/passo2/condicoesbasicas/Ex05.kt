package passo2.condicoesbasicas

fun main() {
    print("Digite um ano: ")
    val ano = readln().toInt()

    if (ano % 4 == 0) {
        if (ano % 100 == 0){
            if (ano % 400 == 0){
                println("O ano $ano é bissexto!")
            } else {
                println("O ano $ano não é bissexto!")
            }
        } else {
            println("O ano $ano é bissexto!")
        }
    } else {
        println("O ano $ano não é bissexto!")
    }
}