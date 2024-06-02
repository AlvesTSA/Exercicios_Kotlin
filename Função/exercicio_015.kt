

import tabuada/*15. Faça um procedimento que recebe, por parâmetro, um valor N e calcula e escreve a tabuada de 1 até N. Mostre a tabuada na forma:

1 x N = N
2 x N = 2N
...
N x N = N^2*/

fun main()
{
    print("Informe o numero que deseja ver a tabuada: ")
    var N = readLine()!!.toInt()

    tabuada(N)
}

fun tabuada(N:Int)
{
    for (i in 1..N)
    {
        println(String.format("%d x %d = %d",i,N,N*i)) 
    }
}