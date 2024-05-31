/*10. Escreva um procedimento que recebes 3 valores reais X, Y e Z e que verifique se esses valores podem ser os comprimentos dos lados de um triângulo e, neste caso, retornar qual o tipo de triângulo formado. Para que X, Y e Z formem um triângulo é necessário que a seguinte propriedade seja satisfeita: o comprimento de cada lado de um triângulo é menor do que a soma do comprimento dos outros dois lados. O procedimento deve identificar o tipo de triângulo formado observando as seguintes definições:

Triângulo Equilátero: os comprimentos dos 3 lados são iguais.
Triângulo Isósceles: os comprimentos de 2 lados são iguais.
Triângulo Escaleno: os comprimentos dos 3 lados são diferentes.*/

fun main()
{
    println("Informe os 3 lados do triangulo:")
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    val z = readLine()!!.toInt()
    var resultado = triangulo(x,y,z)

    println("Resultado: " + resultado)

    return
}

fun triangulo(x:Int, y:Int, z:Int):String
{
    if (x >= y + z || y >= x + z || z >= x + y)
    {
        return "Nao é triangulo"
    }
    else if (x == y && x == z)
    {
        return "Equilátero"
    }
    else if (x == y || x == z || y == z)
    {
        return "Isóseles"
    }
    else
    {
        return "Escaleno"
    }
}