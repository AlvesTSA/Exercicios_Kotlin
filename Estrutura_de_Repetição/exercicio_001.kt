/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. */

fun main(){

    var nota = 0

    do{

        println("Informe uma nota entre zero e dez: ")
        nota = readLine()!!.toInt()

        if(nota <= 0 || nota >= 10){
            
            println("Nota inválida.")
        }
    }while(nota <= 0 || nota >= 10)

    println("Nota atribuída com sucesso!")
}
