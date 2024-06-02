/*19. Faça um programa para imprimir:

1
1   2
1   2   3
.....
1   2   3   ...  n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.*/

fun main()
{
    var n:Int

    do
    {
        print("Informe um valor inteiro: ")
        n = readLine()!!.toInt()

        if (n <= 0) 
        {
            println("Erro: o número deve ser inteiro e positivo.")
        }

    } while (n <= 0)

    imprimir(n)
}

fun imprimir(n:Int)
{
    for (i in 0..n)
    {
        for (j in 1..i)
        {
            print(" "+j)
        }
        println()
    }      
}