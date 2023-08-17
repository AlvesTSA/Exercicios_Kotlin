/*4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento. */

fun main(){

    var populacao_A = 80000.0
    var populacao_B = 200000.0
    var taxa_cresc_A = 0.03
    var taxa_cresc_B = 0.015
    var ano = 0.0

    while(populacao_A < populacao_B){

        populacao_A = populacao_A*Math.pow(1 + taxa_cresc_A, ano++)
        populacao_B = populacao_B*Math.pow(1 + taxa_cresc_B, ano++)
    }

    println("Números de anos necessários: $ano")

    return
}