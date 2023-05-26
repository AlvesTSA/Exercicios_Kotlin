/*. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1- Domingo , 2- Segunda, etc). Se digitar outro valor, deve aparecer “valor inválido.*/

fun main(){

    val dia : Int

    print("Informe um número de 1 á 7: ")
    dia = readLine()!!.toInt()

    when(dia){

        1 -> println("DOMINGO")

        2-> println("SEGUNDA FEIRA")

        3 -> println("TERÇA FEIRA")

        4 -> println("QUARTA FEIRA")

        5 -> println("QUINTA FEIRA")

        6 -> println("SEXTA FEIRA")

        7 -> println("SÁBADO")

        else -> println("Informe um valor válido !!")
    }
}