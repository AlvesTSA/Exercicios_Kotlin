/*13. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem. */

fun main(){

    var expoente = 0
    var base = 0.0
    var resultado = 0.0
    var contador = 0

    println("Informe a base depois o expoente:")
    base = readLine()!!.toDouble()
    expoente = readLine()!!.toInt()
    resultado = base
    print("$base elevado a $expoente = ")

    if(expoente > 0){

        contador = 1
        while(contador != expoente){

            
            contador++
            resultado *= base
        }
    }
    else if(expoente < 0){

        expoente *= -1
        contador = 1

        while(contador != expoente){
            
            contador++
            resultado *= base
        }

        resultado = 1/resultado
    }
    else{

        resultado = 1.0
    }
    println("$resultado")

    return
}