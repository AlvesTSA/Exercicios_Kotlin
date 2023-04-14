//Faça um Programa que converta metros para centímetros.

fun main(){

    val m: Float
    val cm: Float

    println("Informe a medida em metros:")
    m = readLine()!!.toFloat()

    cm = 100*m

    println("A medida em centímetro é: $cm cm")
    
}