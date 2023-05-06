/* Faça um Programa que leia três números e mostre o maior deles. */

fun main(){

    val num1: Int
    val num2: Int
    val num3: Int
    val maior: Int

    println("Informe trÊs números: ");
    num1 = readLine()!!.toInt()
    num2 = readLine()!!.toInt()
    num3 = readLine()!!.toInt()

    if(num1 > num2 && num1 > num3){

        maior = num1
    }

    else if(num2 > num1 && num2 > num3){

        maior = num2

    }

    else{

        maior = num3
    }

    println("Maior: $maior")
    
}