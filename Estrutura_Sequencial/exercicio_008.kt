//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

fun main(){

    val ganho_hora: Double
    val hora_mes: Double
    val salario: Double

    println("Informe quanto você ganha por hora: ")
    ganho_hora = readLine()!!.toDouble()

    println("Informe quantas horas você trabalhou no mes: ")
    hora_mes = readLine()!!.toDouble()

    salario = ganho_hora*hora_mes

    println("Seu salário é: $salario")

}