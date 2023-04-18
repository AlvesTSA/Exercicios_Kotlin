/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:

a)comprar apenas latas de 18 litros;
b)comprar apenas galões de 3,6 litros;
c)misturar latas e galões, de forma que o desperdício de tinta seja menor. 

Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias. */

fun main(){

    val area: Double
    val lata: Double
    val galao: Double
    val custo_lata: Double
    val custo_galao: Double
    val litro_necessario: Double
    val litro_restante: Double
    val galao_restante: Double
    val preco_misto: Double
    val areaComFolga: Double

    println("Informe a área a ser pintada: ")
    area = readLine()!!.toDouble()

    areaComFolga = area * 1.1
    litro_necessario = areaComFolga/6
    lata = litro_necessario/18
    galao = litro_necessario/3.6
    custo_lata = lata*80
    custo_galao = galao*25
    litro_restante = litro_necessario - (lata * 18)
    galao_restante = litro_restante/3.6
    preco_misto = (lata*80)+(galao_restante*25)

    println("Quantidade de latas: $lata")
    println("Quantidade de galões: $galao")
    println("Custo usando latas R$: $custo_lata")
    println("Custo usando galões R$: $custo_galao")
    println("Custo com lata e galão R$: $preco_misto")
}