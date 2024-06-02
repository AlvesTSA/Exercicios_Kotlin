/*18. Faça um programa para imprimir:

1
2   2
3   3   3
.....
n   n   n   n   n   n  ... n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.*/

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
        for (j in 0 until i)
        {
            print(" "+i)
        }
        println()
    }      
}