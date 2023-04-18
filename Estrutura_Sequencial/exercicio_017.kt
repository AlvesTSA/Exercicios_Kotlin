/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 2 situações:

a)comprar apenas latas de 18 litros;
b)comprar apenas galões de 3,6 litros;
 */

fun main(){

    val area: Double
    val lata: Double
    val galao: Double
    val custo_lata: Double
    val custo_galao: Double
    val litro_necessario: Double
   
    println("Informe a área a ser pintada: ")
    area = readLine()!!.toDouble()

    litro_necessario = area/6
    lata = litro_necessario/18
    galao = litro_necessario/3.6
    custo_lata = lata*80
    custo_galao = galao*25

    println("Quantidade de latas: $lata")
    println("Quantidade de galões: $galao")
    println("Custo usando latas R$: $custo_lata")
    println("Custo usando galões R$: $custo_galao")
    
}