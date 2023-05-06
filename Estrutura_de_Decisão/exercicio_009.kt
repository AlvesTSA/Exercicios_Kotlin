/*Faça um Programa que leia três números e mostre-os em ordem decrescente. */

fun main(){

    val num1: Int
    val num2: Int
    val num3: Int
    val maior1: Int
    val maior2: Int
    val maior3: Int

    println("Informe três números: ")
    num1 = readLine()!!.toInt()
    num2 = readLine()!!.toInt()
    num3 = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3) {

        maior1 = num1;
        
        if (num2 > num3) {
            
            maior2 = num2;
            maior3 = num3;

        }
        else {

            maior2 = num3;
            maior3 = num2;

        }
        
    }

    else if (num2 > num1 && num2 > num3) {

        maior1 = num2;
        
        if (num1 > num2) {
            
            maior2 = num1;
            maior3 = num3;

        }
        else {

            maior2 = num3;
            maior3 = num1;
            
        }
        
    }

    else {

        maior1 = num3;
        
        if (num1 > num2) {
            
            maior2 = num1;
            maior3 = num2;

        }
        else {

            maior2 = num2;
            maior3 = num1;
            
        }
        
    }

    println("Ordem decrescente: \n$maior1\n$maior2\n$maior3")

}