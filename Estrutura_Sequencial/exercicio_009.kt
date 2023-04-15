//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.C = 5 * ((F-32) / 9)

fun main(){

    val F: Double
    val C: Double

    println("Informe a temperatura em Fahrenheit: ")
    F = readLine()!!.toDouble()

    C = 5 * ((F-32) / 9)

    println("A temperatura em Celsius é: $C °")
    
}