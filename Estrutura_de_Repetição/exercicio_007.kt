/*7. Faça um programa que leia 5 números e informe o maior número. */

fun main(){

    var maior = 0
    var num = 0

    println("Informe cinco números inteiros: ")
    maior = readLine()!!.toInt()

    for(i in 1..4){

        num = readLine()!!.toInt()

        if(num > maior){

            maior = num
        }
    }

    println("Maior: $maior")

    return
}