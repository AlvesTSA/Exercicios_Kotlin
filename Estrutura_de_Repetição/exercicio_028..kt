/*28. Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.
*/

fun main(){

    var quant_cd: Int
    var soma: Float
    var media: Float 
    var valor_cd: Float
    soma = 0f

    print("Informe a quantidade de CD: ")
    quant_cd = readLine()!!.toInt()

    for(i in 1..quant_cd){

        print("Informe o preço do CD $i: ")
        valor_cd = readLine()!!.toFloat()

        soma += valor_cd
    }

    media = soma/quant_cd.toFloat()

    println("Valor total: $soma")
    println("Valor medio: $media")

    return

}