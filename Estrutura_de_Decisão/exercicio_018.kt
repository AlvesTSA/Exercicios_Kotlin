/* Faça um Programa que peça um número inteiro e determine se ele e par ou ímpar.*/

fun main(){

    val num : Int

        print("Informe um número inteiro: ")
        num = readLine()!!.toInt()

        if (num % 2 == 0){

            println("Número par")
        }
        else{

           println("Número impar")
        }

}