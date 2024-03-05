/*7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.*/

fun main(){

    var vetor = IntArray(5)
    var soma = 0
    var mult = 1

    println("Informe 5 numeros inteiros:")

    for(i in 0 until 5){

        vetor[i] = readLine()!!.toInt()

        soma += vetor[i]
        mult *= vetor[i]
    }

    println("Soma: ${soma}")
    println("Multiplicação: ${mult}")
    print("Numeros lidos:")

    for(i in 0 until 5){

        print("${vetor[i]} ")
    }

    return
}