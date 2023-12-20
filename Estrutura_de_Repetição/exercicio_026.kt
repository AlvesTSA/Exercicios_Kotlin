/*26. Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato. */

fun main() {
    var eleitores: Int
    var candidato: Int 
    var candidato1: Int = 0
    var candidato2: Int = 0
    var candidato3: Int = 0

    print("Informe o número de eleitores: ")
    eleitores = readLine()!!.toInt()

    for (i in 1..eleitores) {
        do {
            print("Informe qual candidato deseja votar [1] [2] [3]: ")
            candidato = readLine()!!.toInt()
            when (candidato) {
                1 -> {
                    candidato1++
                    break
                }
                2 -> {
                    candidato2++
                    break
                }
                3 -> {
                    candidato3++
                    break
                }
                else -> {
                    println("Erro: informe 1, 2 ou 3")
                }
            }
        } while (candidato < 1 || candidato > 3)
    }

    println("Candidato 1: $candidato1 votos")
    println("Candidato 2: $candidato2 votos")
    println("Candidato 3: $candidato3 votos")

    return
}
