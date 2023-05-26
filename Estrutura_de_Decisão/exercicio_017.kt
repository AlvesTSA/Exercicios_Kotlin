/*. Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.*/

fun main(){

    val ano : Int

    print("Informe um ano: ")
    ano = readLine()!!.toInt()

    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){

        println("$ano é um ano bissexto.")

    }
    else{

        println("$ano não é um ano bissexto.")

    }
}