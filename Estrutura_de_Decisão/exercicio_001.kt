/*Faça um Programa que peça dois números e imprima o maior deles. */

fun main(){

    val num1: Int
    val num2: Int
    val maior: Int
    println("Informe dois números: ")
    num1 = readLine()!!.toInt()
    num2 = readLine()!!.toInt()

    if (num1 > num2){

        maior = num1

    }
    else {

        maior = num2

    }

    println("Maior: $maior")


}