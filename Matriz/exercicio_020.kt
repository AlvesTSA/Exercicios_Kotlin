/*20. Considere uma matriz de distância entre cidades 6 x 6:

(Cáceres)	(BBugres)	(Cuiabá)	(VGrande)	(Tangará)	(PLacerda)
(Cáceres)		63	210	190		190
(BBugres)	63		160	150	95	
(Cuiabá)	210	160		10		
(VGrande)	190	150	10			
(Tangará)		95				80
(PLacerda)	190				80	
Considere também um vetor de viagem indo de Cuiabá até Cáceres pela seguinte rota:
Índice	1	2	3	4	5	6
Cidade	3	4	2	5	6	1
Faça um programa que leia a matriz e o vetor e calcule a distancia percorrida durante a viagem. */

fun main(){

    var NUM_CIDADES = 6
    val matriz_distancia = arrayOf(
        intArrayOf(0, 63, 210, 190, 0, 190),
        intArrayOf(63, 0, 160, 150, 95, 0),
        intArrayOf(210, 160, 0, 10, 0, 0),
        intArrayOf(190, 150, 10, 0, 0, 0),
        intArrayOf(0, 95, 0, 0, 0, 80),
        intArrayOf(190, 0, 0, 0, 80, 0)
    )
    // Vetor de viagem
    var vetor_viagem = arrayOf(3, 4, 2, 5, 6, 1)
    var distancia_total = 0

    // Calculando a distância percorrida
    for(i in 0 until (NUM_CIDADES - 1)) {
        var cidade_atual = vetor_viagem[i] - 1 // Ajuste para índice 0-based
        var proxima_cidade = vetor_viagem[i + 1] - 1 // Ajuste para índice 0-based
        distancia_total += matriz_distancia[cidade_atual][proxima_cidade]
    }

    // Exibindo a distância total
   println("Distancia total percorrida: "+distancia_total)

   return
}