/*10. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.*/

fun main(){

    var primeiro = IntArray(10)
    var segundo = IntArray(10)
    var terceiro = IntArray(20)
    var y = 0

    println("Informe os elementos do primeiro vetor:")

    for(i in 0 until 10){

        primeiro[i] = readLine()!!.toInt()

        terceiro[y] = primeiro[i]
        y += 2
    }

    println("Informe os elementos do segundo vetor:")
    y = 1

    for(i in 0 until 10){

        segundo[i] = readLine()!!.toInt()

        terceiro[y] = segundo[i]
        y += 2
    }

    print("Terceiro vetor: ")

    for(i in 0 until 20){

        print("${terceiro[i]} ")
    }

    return
}