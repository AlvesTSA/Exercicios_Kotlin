/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.*/

fun main(){

    val area: Double
    val lata_tinta: Double
    val custo: Double

    println("Informe a área a ser pintada: ")
    area = readLine()!!.toDouble()

    lata_tinta = area/(18*3)
    custo = lata_tinta*80.00

    println("Quantidade de latas a serem compradas: $lata_tinta")
    println("Custo total R$: $custo")


}