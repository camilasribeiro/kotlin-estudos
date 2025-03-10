package passo9.funcoes

fun main() {
    contador(4, 20, 3)
}

fun contador(inicio: Int, fim: Int, contagem: Int) {
    for (i in inicio..fim step contagem) {
        print("$i >> ")
    }
    print("FIM")
}