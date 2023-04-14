//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

fun main(){

    val nota1: Float
    val nota2: Float
    val nota3: Float
    val nota4: Float
    val media: Float

    println("informe a nota do primeiro bimestre: ")
    nota1 = readLine()!!.toFloat()

    println("informe a nota do segundo bimestre: ")
    nota2 = readLine()!!.toFloat()

    println("informe a nota do terceiro bimestre: ")
    nota3 = readLine()!!.toFloat()

    println("informe a nota do quarto bimestre: ")
    nota4 = readLine()!!.toFloat()

    media = (nota1 + nota2 + nota3 + nota4)/4

    println("Sua nota final é: $media")
    
}