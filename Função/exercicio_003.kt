/*3. Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.*/

fun main()
{
    val size = 3
    var num = FloatArray(size)

    for(i in 0 until size)
    {
        print("Informe o número " + (i + 1) + ": " )
        num[i] = readLine()!!.toFloat()
    }

    var result = sum(num[0],num[1],num[2])
    println("Soma dos números: "+result)

    return
}

fun sum( a:Float, b:Float, c:Float):Float
{
    var resultado = a + b + c

    return resultado
}