/*13. Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).*/

fun main(){

    var temp = FloatArray(12)
    var meses = arrayOf("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "junho", "julho", "Agosto", "Setermbro", "Outubro", "Novembro", "Dezembro")
    var media = 0.0

    for (i in 0 until 12) {
            
        println("Informe a temperatura media do mes de ${meses[i]}: ")
        temp[i] = readLine()!!.toFloat()

        media += temp[i]
    }

    media /= 12.0
    println("Meses com temperatura acima da media anual\n")

    for (i in 0 until 12) {
        
        if (temp[i] > media) {
            
            println("${i + 1} - ${ meses[i]}: ${temp[i]} °C")
        }
    }

    return
}