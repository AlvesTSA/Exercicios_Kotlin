//Faça um Programa que peça dois números e imprima a soma.

fun main(){

    val num1: Float 
    val num2: Float
    val soma: Float

    println("Informe o primeiro número: ")
    num1 = readLine()!!.toFloat()

    println("Informe o segundo número: ")
    num2 = readLine()!!.toFloat()

    soma = num1 + num2

    println("A soma dos números é: $soma")

}