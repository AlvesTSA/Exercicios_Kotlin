/*21. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1. */

fun main(){

    var num: Int
    var resto: Int
    var divisivel: Int
    divisivel = 0

    print("Informe um número inteiro: ")
    num = readLine()!!.toInt()

    for(i in 1..num){

        resto = num % i

        if(resto == 0){

            divisivel++
        }
    }
    if(divisivel > 2){

        println("Primo: não")
    }
    else{

        println("Primo: sim")
    }

    return
}