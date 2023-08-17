/*5. Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação. */

fun main(){

    var populacao_A = 0.0
    var populacao_B = 0.0
    var taxa_cresc_A = 0.0
    var taxa_cresc_B = 0.0
    var ano = 0.0

    do{
        println("Informe a população inicial de da cidade A e B: ")
        populacao_A = readLine()!!.toDouble()
        populacao_B = readLine()!!.toDouble()

        if(populacao_A > populacao_B){

            println("ERROR:A populção da cidade A deve ser maior que a de B.")
        }
    }while(populacao_A > populacao_B)

    do{
        println("Informe a taxa de crescimento da cidade A e B: ")
        taxa_cresc_A = readLine()!!.toDouble()
        taxa_cresc_B = readLine()!!.toDouble()

        if(taxa_cresc_A <= 0 || taxa_cresc_B <= 0){

            println("ERROR:A taxa de crescimento deve ser maior que zero.")
        }
    }while(taxa_cresc_A <= 0 || taxa_cresc_B <= 0)

    taxa_cresc_A = taxa_cresc_A / 100.0
    taxa_cresc_B = taxa_cresc_B / 100.0

    while(populacao_A < populacao_B){

        populacao_A = populacao_A*Math.pow(1 + taxa_cresc_A, ano++)
        populacao_B = populacao_B*Math.pow(1 + taxa_cresc_B, ano++)
    }

    println("Números de anos necessários: $ano")

    return

}