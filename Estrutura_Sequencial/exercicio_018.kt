/*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). */

fun main(){

    val mb: Double
    val mbps: Double
    val t: Double

    println("Informe o tamanho do arquivo em MB: ");
    mb = readLine()!!.toDouble()
    
    println("Informe a velocidade em Mbps: ");
    mbps = readLine()!!.toDouble()

    t = mb/mbps

    println("O tempo para dowloading: $t min")


}