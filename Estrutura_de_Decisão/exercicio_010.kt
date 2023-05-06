/*Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */

fun main(){

    val turno: Char

    println("Qual turno você estuda ?\nInforme a letra correspondente\nM-matutino\nV-Vespertino\nN-Noturno")
    turno = readLine()!!.toCharArray()[0]

    when (turno) {

        'M' -> print("BOM DIA !")
            
        'V' -> print("BOA TARDE !")

        'N' -> print("BOA NOITE !")

        else -> println("Valor inválido !")

    }
}