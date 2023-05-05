/*. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. */

fun main(){

    val valor: Int

    println("Informe um valor: ")
    valor = readLine()!!.toInt()

    if(valor > 0){

        println("Positivo")

    }
    else{

        println("Negaivo")
    }

}