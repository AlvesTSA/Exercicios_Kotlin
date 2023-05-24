/*As organizações CSM resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:

Salários até R$ 280,00 (incluindo): aumento de 20%; 

Salários entre R$ 280,00 e R$700,00: aumento de 15%; 

Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;

Salários de R$ 1500,00 em diante: aumento de 5%.

Após o aumento ser realizado; informe na tela;

O salário antes do reajuste; 
 
O percentual de aumento aplicado; 
 
O valor do aumento;

O novo salário, após o aumento.  
*/

fun main(){

    val salario : Double 
    val aumento : Double
    val new_salario : Double
    val percentual : Int
  

    print("Informe seu salário atual: ")
    salario = readLine()!!.toDouble()

    if (salario > 0 && salario <= 280){

        percentual = 20;
        aumento = salario*0.2;
        new_salario = aumento + salario;

        print("Salário sem reajuste R$: $salario\nPercentual de aumento aplicado: $percentual\nAumento R$: $aumento\nSalário atual R$: $new_salario")

    }
    else if(salario > 200 && salario <= 700){

        percentual = 15;
        aumento = salario*0.15;
        new_salario = aumento + salario;

        print("Salário sem reajuste R$: $salario\nPercentual de aumento aplicado: $percentual\nAumento R$: $aumento\nSalário atual R$: $new_salario")
        
    }
    else if(salario > 700 && salario <= 1500){

        percentual = 10;
        aumento = salario*0.1;
        new_salario = aumento + salario;

        print("Salário sem reajuste R$: $salario\nPercentual de aumento aplicado: $percentual\nAumento R$: $aumento\nSalário atual R$: $new_salario")

    }
    else if(salario > 1500){

        percentual = 5;
        aumento = salario*0.05;
        new_salario = aumento + salario;

        print("Salário sem reajuste R$: $salario\nPercentual de aumento aplicado: $percentual\nAumento R$: $aumento\nSalário atual R$: $new_salario")

    }
    else{

        print("Informe um valor válido");

    }
}