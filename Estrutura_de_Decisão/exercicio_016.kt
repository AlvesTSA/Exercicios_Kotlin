/* Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax^2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
  
Se o usuário informar o valor de A igual a zero. a equação não e do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
  
Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o programa;

Se o delta calculado for igual a zero a equação possui apenas uma raiz real, informe ao usuário;

Se o delta for positivo, a equação possui duas raízes reais, informe-as ao usuário; */

import kotlin.math.sqrt
import kotlin.math.pow

fun main(){

    val a : Double
    val b : Double
    val c : Double
    val delta : Double 
    val x1 : Double
    val x2 : Double

    print("Informe o valor de a: ");
    a = readLine()!!.toDouble();

    if (a != 0.0){
        
        println("Informe o valor de b: ");
        b = readLine()!!.toDouble();
        println("Informe o valor de c: ");
        c = readLine()!!.toDouble();

        delta = b.pow(2) - 4*a*c

        if (delta > 0){
            
            x1 = (- b + sqrt(delta))/2*a
            x2 = (- b - sqrt(delta))/2*a

            println("Valor de x': $x1")
            println("Valor de x'': $x2")
            
        }
        else if (delta == 0.0){
            
            x1 = (- b)/2*a;
            x2 = (- b)/2*a;

            println("Valor de x': $x1")
            println("Valor de x'': $x2")

        }
        
        else{

            println("Os valores de x não são reais.")

        }
        
    }
    else{

        println("A equação não é do segundo grau, informe um valor de 'a' diferente de zero")

    }
}