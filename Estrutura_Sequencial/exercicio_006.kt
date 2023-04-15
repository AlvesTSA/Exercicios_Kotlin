//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área

fun main(){

    val raio: Double
    val area: Double

    println("Informe a medida do raio: ")
    raio = readLine()!!.toDouble()

    area = (raio*raio)*3.14

    println("A área do círculo é: $area")

}