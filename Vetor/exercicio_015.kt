/*15. Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser armazenado). Após esta entrada de dados, faça:

 a. Mostre a quantidade de valores que foram lidos; 

 b. Exiba todos os valores na ordem em que foram informados, um ao lado do outro; 

 c. Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;

 d. Calcule e mostre a soma dos valores;
 
 e. Calcule e mostre a média dos valores;

 f. Calcule e mostre a quantidade de valores acima da média calculada;

 g. Calcule e mostre a quantidade de valores abaixo de sete;

 h. Encerre o programa com uma mensagem;

*/
fun main(){

    var notas = FloatArray(100)
    var count1 = 0

    println("Informe as notas e digite -1 para finalizar:");

    for (i in 0 until 100){
        
        println("Informe a nota ${i + 1}: ")
        notas[i] = readLine()!!.toFloat()

        if (notas[i] == -1f) {
            break;
        }

        count1++;
    }

    //a. Mostre a quantidade de valores que foram lidos;

    println("Quantidade de valores lidos: ${count1}")

    //b. Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
    print("Valores lidos: ")
    for (i in 0 until count1){
        
        print("${notas[i]} ");
    }

    //c. Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
    println("\nValores lidos na ordem inversa: ")
    for (i in count1 - 1 downTo 0){
        
        println(notas[i])
    }
    
    //d. Calcule e mostre a soma dos valores;
    var soma = 0.0
    for (i in 0 until count1) {
        
        soma += notas[i]
    }
    println("Soma: ${soma}")

    //e. Calcule e mostre a média dos valores;
    var media = soma / count1
    println("Media: ${media}")

    //f. Calcule e mostre a quantidade de valores acima da média calculada;
    var count2 = 0
    for (i in 0 until count1) {
        
        if (notas[i] > media) {
            count2++
        }
    }
    System.out.println("Quantidade de valores acima da media: ${count2}")

    //g. Calcule e mostre a quantidade de valores abaixo de sete;
    var count3 = 0
    for (i in 0 until count1){
        
        if (notas[i] < 7.0) {
            count3++
        }
    }
    println("Quantidade de valores abaixo de 7: ${count3}")

    //h. Encerre o programa com uma mensagem;

    println("Obrigado pela participacao")

    return
}