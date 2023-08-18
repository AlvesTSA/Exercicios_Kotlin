/*9. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50. */

fun main(){

    var num = 0
    var resto = 0

    for(i in 1..50){

        num++
        resto = num % 2

        if(resto != 0){

            print("$num ")
        }
    }

    return
}