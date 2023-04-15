//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. F = 1.8*C + 32

fun main(){

    val F: Double
    val C: Double

    println("Informe a temperatura em Celsius: ")
    C = readLine()!!.toDouble()

    F = 1.8*C + 32

    println("A temperatura em Fahrenheit é: $F °")

    
}