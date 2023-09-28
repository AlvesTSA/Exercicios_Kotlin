/*14. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares. */

fun main(){

    var num = 0
    var impar = 0
    var par = 0
    var resto = 0

    println("Informe 10 números inteiros:")

    for(i in 1..10){

        num = readLine()!!.toInt()
        resto = num % 2

        if(resto == 0){

            par++
        }
        else{

            impar++
        }
    }

    print("Quantidade impar: $impar\nQuantidade par: $par")

    return
}
