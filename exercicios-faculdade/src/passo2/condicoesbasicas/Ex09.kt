package passo2.condicoesbasicas

fun main() {
    print("Digite o tamanho do primeiro segmento: ")
    val segmentoA = readln().toInt()

    print("Digite o tamanho do segundo segmento: ")
    val segmentoB = readln().toInt()

    print("Digite o tamanho do terceiro segmento: ")
    val segmentoC = readln().toInt()

    if ((segmentoA + segmentoB) > segmentoC && (segmentoA + segmentoC) > segmentoB && (segmentoB + segmentoC) >
        segmentoA) {
        println("É possível formar um triângulo!")
    } else {
        println("Não é possível formar um triângulo!")
    }
}

//[DESAFIO] Crie um programa que leia o tamanho de três segmentos
//de reta. Analise seus comprimentos e diga se é possível formar um
//triângulo com essas retas. Matematicamente, para três segmentos
//formarem um triângulo, o comprimento de cada lado deve ser menor
//que a soma dos outros dois.