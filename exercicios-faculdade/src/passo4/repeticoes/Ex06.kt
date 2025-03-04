package passo4.repeticoes

fun main() {
    for (i in 30 downTo 1){
        if (i % 4 == 0) {
            print("[${i}] ")
        } else {
            print("$i ")
        }
    }
}