/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
a)Para homens: (72.7*h) - 58
b)Para mulheres: (62.1*h) - 44.7
 */

fun main(){

    val h: Double
    val peso_homem: Double
    val peso_mulher: Double

    println("Informe a sua altura: ")
    h = readLine()!!.toDouble()

    peso_homem = (72.7*h) - 58
    peso_mulher = (62.1*h) - 44.7

    println("O peso ideal para homens é: $peso_homem Kg")
    println("O peso ideal para mulheres é: $peso_mulher Kg")
    
}