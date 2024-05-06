/*13.Crie um tabuleiro de jogo da velha, usando uma matrizes de caracteres (char) 3×3, onde o usuário pede o número da linha (1 até 3) e o da coluna (1 até 3). A cada vez que o usuário entrar com esses dados, colocar um ‘X’ ou ‘O’ no local selecionado.*/

fun main(){

    var size = 3
    var matriz = Array(size){Array(size){' '}}
    var i:Int
    var j:Int

    for (z in 0 until (size*size)){
    
        do{
            print("Informe a linha: ")
            i = readLine()!!.toInt()
            print("Informe a coluna: ")
            j = readLine()!!.toInt()

            if ((i < 1 || i > size) || (j < 1 || j > size)){
                
                println("ERRO: Valor invalido, informe de 1 a $size")
            }
            if (matriz[i-1][j-1] == 'X' || matriz[i-1][j-1] == 'O'){
            
                println("ERRO: Esse espaco ja foi preenchido.")
            }
        
        } while ((i < 1 || i > size) || (j < 1 || j > size) || matriz[i-1][j-1] == 'X' || matriz[i-1][j-1] == 'O')

        if (z % 2 == 0){

            matriz[i-1][j-1] = 'X'
        }
        else{

            matriz[i-1][j-1] = 'O'
        }
    }

    println("Resultado do jogo:")
    for (w in 0 until size){
        
        for (z in 0 until size){
            
            print("${matriz[w][z]} ")
        }
        println()
    }
    return
}