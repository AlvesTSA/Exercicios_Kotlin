/*14. Faça um jogo de batalha naval, utilize as seguinte regras:

– O primeiro usuário será o que vai configurar o tabuleiro inserindo os navios.
– O tabuleiro deve ter 8×8
– Quando inserido todos os navios o restante será considerado como “água”.
– Cada navio pode ocupar apenas 1 posição
– O jogador deve respeitar o espaço de 1 célula entre os navios
– O jogador que irá descobrir onde os navios estão tem apenas 10 tiros
– O jogador 1 pode posicionar 5 navios */

import kotlin.random.Random

fun main(){

    var size = 8
    var tabuleiro = Array(size){Array(size){0}}
    var linha:Int
    var coluna:Int
    var tiros = 10
    var quant_navios = 5

    for (i in 0 until quant_navios){
    
        do{
            linha = Random.nextInt(1,size)
            coluna = Random.nextInt(1,size)

        } while (tabuleiro[linha][coluna] == 1)
        
        tabuleiro[linha][coluna] = 1
    }

    for (i in 0 until size){
        
        for (j in 0 until size){
            
            if (tabuleiro[i][j] != 1){
                
                tabuleiro[i][j] = 0
            }
        }  
    }
    
    var abatido = 0

    for (i in 0 until tiros){
        
        print("infome linha: ")
        linha = readLine()!!.toInt()
        print("infome coluna: ")
        coluna = readLine()!!.toInt()
        linha -= 1 
        coluna -= 1

        if (tabuleiro[linha][coluna] == 1){
            
            println("Navio abatido.")
            abatido++
        }
        else{

            println("Errou")
        }
    }

    println("Voce afundou $abatido navio(s)")

    return
}