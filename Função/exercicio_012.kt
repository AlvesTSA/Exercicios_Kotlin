/*12. Faça uma função que leia um número não determinado de valores positivos e retorna a média aritmética dos mesmos.*/

fun main()
{
    var media = mediaAritmetica()
    println(String.format("Media aritmetica: %.2f\n",media))
}

fun mediaAritmetica():Float
{
    var media = 0.0F
    var count = 0

    println("Informe numeros inteiros ou informe -1 para sair:")

    do
    {
        var numero = readLine()!!.toFloat()

        if (numero == -1.0F)
        {
            break
        }
        
        media += numero
        count++
        
    } while (numero != -1.0F)

    if (count == 0) 
    {
        return 0.0F // Evita divisão por zero se nenhum número for inserido
    }
    
    return media / count 
}
