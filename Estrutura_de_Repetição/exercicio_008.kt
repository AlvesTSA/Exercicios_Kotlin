/*8. Faça um programa que leia 5 números e informe a soma e a média dos números. */

fun main(){

    var num = 0.0
    var soma = 0.0
    var media = 0.0
    var contador = 0

    println("Informe 5 números: ")

    for(i in 1..5){

        num = readLine()!!.toDouble()
        soma += num

        contador++
    }

    media = soma/contador

    println("Soma = $soma\nMédia = $media")

    return
}