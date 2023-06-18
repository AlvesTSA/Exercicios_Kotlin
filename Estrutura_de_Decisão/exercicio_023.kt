/* Um posto está vendendo combustíveis com a seguinte tabela de descontos

Álcool:
 
Até 20 litros: desconto de 3% por litro;
Acima de 20 litros: Desconto de 5% por litro.

Gasolina:

Até 20 litros: desconto de 4% por litro
Acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool. G-gasolina), calcule e imprima o valor a ser pago pelo cliente.*/

fun main(){

    var op: Char
    var litro: Double
    var preco_litro: Double
    var desconto: Double
    var valor = 0.0

    println("Informe a quantidade que deseja: ")
    litro = readLine()!!.toDouble()
    println("Informe o tipo do combustível\nA-álcool\nG-gasolina")
    op = readLine()!!.toCharArray()[0]

    when (op){

        'A' ->{ 
        
            if(litro > 0.0 && litro <= 20.0){

                preco_litro = 4.0
                desconto = preco_litro*0.03
                preco_litro = preco_litro - desconto
                valor = preco_litro*litro

            }
            else{

                preco_litro = 4.0
                desconto = preco_litro*0.05
                preco_litro = preco_litro - desconto
                valor = preco_litro*litro
            }
        }

        'G' ->{

            if(litro > 0.0 && litro <= 20.0){

                preco_litro = 5.0
                desconto = preco_litro*0.04
                preco_litro = preco_litro - desconto
                valor = preco_litro*litro

            }
            else{

                preco_litro = 5.0
                desconto = preco_litro*0.06
                preco_litro = preco_litro - desconto
                valor = preco_litro*litro
            }
        }
        else -> {
        
            println("Informe um valor válido")
            
            return
        }
    }

    println("Valor a ser pago: $valor")

}