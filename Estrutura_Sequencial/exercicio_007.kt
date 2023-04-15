//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

fun main(){

    val lado: Float
    val area: Float

    println("Informe a medida de um dos lados do quadrado: ")
    lado = readLine()!!.toFloat()

    area = lado*lado*2

    println("O dobro da área é: $area")
    
}