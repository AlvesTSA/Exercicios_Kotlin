/*25. Considere um vetor de trajetórias de 9 elementos, onde cada elemento possui o valor do próximo elemento do vetor a ser lido.

Índice       1    2    3    4    5    6    7     8     9                      
Valor       5    7    6    9     2   8    4     0     3            
Assim, a seqüência da leitura seria 1, 5, 2, 7, 4, 9, 3, 6, 8, 0
Faça um algoritmo que seja capaz de ler esse vetor e seguir a trajetória.*/

fun main(){

    var indice = 1
    var valor = arrayOf(5,7,6,9,2,8,4,0,3)

    print("Caminho: ${indice} ")

    for (i in 0 until 9){
        
        print("${valor[indice - 1]} ")
        indice = valor[indice - 1]
    }

    return
}