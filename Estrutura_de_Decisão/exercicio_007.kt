/* Faça um Programa que leia três números e mostre o maior e o menor deles. */

fun main(){

    val num1: Int
    val num2: Int
    val num3: Int
    val maior: Int
    val menor: Int

    println("Informe trÊs números: ")
    num1 = readLine()!!.toInt()
    num2 = readLine()!!.toInt()
    num3 = readLine()!!.toInt()

    if(num1 > num2 && num1 > num3){

        maior = num1

        if(num2 < num3){

            menor = num2
        }
        else {

            menor = num3
        }
    }

    else if(num2 > num1 && num2 > num3){

        maior = num2

        if(num1 < num3){

            menor = num1
        }
        else {

            menor = num3
        }
    }

    else{

        maior = num1

        if(num1 < num2){

            menor = num1
        }
        else {

            menor = num2
        }
    }
    
    println("Maior: $maior\nMenor: $menor")

}