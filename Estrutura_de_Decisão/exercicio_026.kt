/* Uma fruteira está vendendo frutas com a seguinte tabela de preços:

Até 5 Kg de morango: R$ 2,50 por Kg 
Acima de 5 Kg de morango: R$ 2,20 por Kg

Até 5 Kg de maçã: R$ 1,80 por Kg 
Acima de 5 Kg de maçã: R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/

fun main(){

    var kilo_ma = 0.0;
    var kilo_mo = 0.0;
    var valor = 0.0;
    var valor_ma = 0.0;
    var valor_mo = 0.0;
    var kilo_total = 0.0;
    var desconto = 0.0;

    println("Informe a quantidade de morango:")
    kilo_mo = readLine()!!.toDouble()
    println("Informe a quantidade de maçã:")
    kilo_ma = readLine()!!.toDouble()

    if(kilo_mo > 0 && kilo_mo <= 5){

        valor_mo = kilo_mo*2.50
        
    }
    else{

        valor_mo = kilo_mo*2.20
    }
    if(kilo_mo > 0 && kilo_mo <= 5){

        valor_ma = kilo_ma*1.80
        
    }
    else{

        valor_ma = kilo_ma*1.50
    }

    valor = valor_ma + valor_mo
    kilo_total = kilo_ma + kilo_mo

    if(valor > 25.0 && kilo_total > 8.0){

        desconto = valor*0.10
        valor = valor - desconto
    }
    else{

        valor = valor_ma + valor_mo
    }

    println("Valor a ser pago: $valor")
}


