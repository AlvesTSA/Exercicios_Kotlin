//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

fun main(){

    val altura: Double
    val peso_ideal: Double

    println("Informe a sua altura: ")
    altura = readLine()!!.toDouble()

    peso_ideal = (72.7*altura) - 58

    println("Seu peso ideal é: $peso_ideal Kg")

}