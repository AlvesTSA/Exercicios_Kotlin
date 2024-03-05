/*9. Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.*/

fun main(){

    var A = IntArray(10)
    var soma = 0

    println("Informe 10 numeros inteiros:")

    for(i in 0 until 10){

        A[i] = readLine()!!.toInt()

        soma += (A[i] * A[i])
    }

    println("Soma dos quadrados: ${soma}")

    return
}