/*9. Faça uma função que recebe a média final de um aluno por parãmetro e retorna o seu conceito, conforme a tabela abaixo:

Nota	       Conceito
de 0,0 a 4,9	 D
de 5,0 a 6,9	 C
de 7,0 a 8,9	 B
de 9,0 a 10,0	 A

*/

fun main()
{
    print("Informe sua nota media: ")
    val nota = readLine()!!.toFloat()

    val conceito = conceitoNota(nota)
    println(String.format("Conceito: %c",conceito))

    return
}

fun conceitoNota(nota:Float):Char
{
    if (nota >= 0.0 && nota <= 4.9)
    {
        return 'D'
    }
    else if (nota >= 5.0 && nota <= 6.9)
    {
        return 'C'
    }
    else if (nota >= 7.0 && nota <= 8.9)
    {
        return 'B'
    }
    else
    {
        return 'A'
    }  
}