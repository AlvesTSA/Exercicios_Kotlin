/*11. Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.*/

fun main(){

    var primeiro = IntArray(10)
    var segundo = IntArray(10)
    var terceiro = IntArray(10)
    var quarto = IntArray(30)
    var y = 0

    println("Informe os elementos do primeiro vetor:")

    for(i in 0 until 10){

        primeiro[i] = readLine()!!.toInt()

        quarto[y] = primeiro[i]
        y += 3
    }

    println("Informe os elementos do segundo vetor:")
    y = 1

    for(i in 0 until 10){

        segundo[i] = readLine()!!.toInt()

        quarto[y] = segundo[i]
        y += 3
    }

    println("Informe os elementos do terceiro vetor:")
    y = 2

    for(i in 0 until 10){

        terceiro [i] = readLine()!!.toInt()

        quarto[y] = terceiro[i]
        y += 3
    }

    print("Quarto vetor: ")

    for(i in 0 until 30){

        print("${quarto[i]} ")
    }

    return
}