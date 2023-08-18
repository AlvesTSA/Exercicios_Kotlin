/*10. Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles. */

fun main(){

    var num1 = 0
    var num2 = 0
    var temp = 0

    println("Informe dois números: ")
    num1 = readLine()!!.toInt()
    num2 = readLine()!!.toInt()

    if(num1 > num2){

        temp = num1
        num1 = num2
        num2 = temp
    }

    while(num1 < num2 - 1){

        num1++
        print("$num1 ")
    }

    return
}