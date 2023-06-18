/*
Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.Exemplo:326 = 3 centenas, 2 dezenas e 6 unidades
*/

fun main(){

    var num: Int
    var centena: Int
    var dezena: Int
    var unidade: Int

    println("Informe um numero inteiro de 1 a 999:")
    num = readLine()!!.toInt()

    if(num > 0 && num <= 1000){

        centena = num / 100
        num %= 100
        dezena = num / 10
        num %= 10
        unidade = num
    }
    else{

        println("Informe um valor valido")

        return
    }

    println("Cezena: $centena\nDezena: $dezena\nUnidade: $unidade" )

}