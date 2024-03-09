/*20. Faça um programa que carregue uma lista com os modelos de cinco carros (exemplo de modelos: FUSCA, GOL, VECTRA etc). Carregue uma outra lista com o consumo desses carros, isto é, quantos quilômetros cada um desses carros faz com um litro de combustível. Calcule e mostre:
  
 a. O modelo do carro mais econômico; 

 b. Quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1000 quilômetros e quanto isto custará, considerando um que a gasolina custe R$ 2,25 o litro. Abaixo segue uma tela de exemplo. O disposição das informações deve ser o mais próxima possível ao exemplo. Os dados são fictícios e podem mudar a cada execução do programa.

Comparativo de Consumo de Combustível
Veículo 1
Nome: fusca
Km por litro: 7
Veículo 2
Nome: gol
Km por litro: 10
Veículo 3
Nome: uno
Km por litro: 12.5
Veículo 4
Nome: Vectra
Km por litro: 9
Veículo 5
Nome: Peugeout
Km por litro: 14.5

Relatório Final
1 - fusca           -    7.0 -  142.9 litros - R$ 321.43
2 - gol             -   10.0 -  100.0 litros - R$ 225.00
3 - uno             -   12.5 -   80.0 litros - R$ 180.00
4 - vectra          -    9.0 -  111.1 litros - R$ 250.00
5 - peugeout        -   14.5 -   69.0 litros - R$ 155.17
O menor consumo é do peugeout.*/

import java.text.DecimalFormat

fun main(){

    var nome = Array<String>(5) { "" }
    var consumo = FloatArray(5)
    var preco = 2.25F

    println("Comparativo de Consumo de Combustível\n")

    for (i in 0 until 5){
        
        println("Veiculo ${i + 1}")
        print("Nome: ")
        nome[i] = readLine()!!
        print("Consumo: ")
        consumo[i] = readLine()!!.toFloat()
    }

    var menor_consumo = consumo[0]
    var y = 0

    for (i in 0 until 5){
        
        if (consumo[i] > menor_consumo){
            
            y = i
        }
    }

    println("Relatorio final\n")

    for (i in 0 until 5){

        var litros = (1000 / consumo[i])
        var valor = preco * litros
        var consumofor = DecimalFormat("#.##")
        var consumoforr = consumofor.format(consumo[i])
        var valorfor = DecimalFormat("#.##")
        var valorforr = valorfor.format(valor)
        var litrosfor = DecimalFormat("#.##")
        var litrosforr = litrosfor.format(litros)
        println("${i + 1}  -  ${nome[i]}   - ${consumoforr}   -   ${litrosforr}    litros - R$ ${valorforr}")
    }

    println("O menor consumo e do ${nome[y]}")

    return
}

