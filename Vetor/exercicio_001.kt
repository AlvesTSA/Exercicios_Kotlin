/*1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.*/

fun main(){

    val num = IntArray(5)

    for(i in 0..4){

        print("Informe o ${i + 1}° numero: ")
        num[i] = readLine()!!.toInt()
    }

    for(i in 0..4){

        print("${num[i]} ")
    }

    return
}