/*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.*/

fun main(){

    var dia = 0
    var mes = 0
    var ano = 0
    var data = true

    println("Informe uma data dd/mm/aaaa: ")
    dia = readLine()!!.toInt()
    mes = readLine()!!.toInt()
    ano = readLine()!!.toInt()

    if (ano < 0){
        
        data = false

    }
    else if(mes <= 0 || mes > 12){

        data = false

    }
    else if(dia <= 0 || dia > 31){

        data = false

    }
    else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){

        data = false

    }
    else if(mes == 2){

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){

            if(dia > 29){

                data = false

            }
        }
        else{

            if(dia > 28){

                data = false

            }
        }
    }
    if(data){

        println("Data: %02d/%02d/%04d".format(dia, mes, ano))
        

    }
    else{

        println("Data inválida! Tente novamente.")
    }
}