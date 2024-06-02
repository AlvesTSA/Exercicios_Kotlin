/*20. Faça um programa que converta da notação de 24 horas para a notação de 12 horas. 
Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. 
Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída. 
Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes que desejar.*/

fun main()
{
    var hora24:Int
    var min24:Int
    
    do
    {
        print("Informe a hora no formato (HH MM):\n")
        hora24 = readLine()!!.toInt()
        min24 =  readLine()!!.toInt()

        var (hora12,min12,prefixo) = converterHora(hora24,min24)
        imprimir(hora12,min12,prefixo)

        print("\nDeseja inserir mais algum valor, digite S para sim e N para nao:")
        var sair = readLine()!!

    } while (sair == "s" || sair == "S")
}

data class Tempo(var hora12: Int,var min12: Int,var prefixo: Char)

fun converterHora(hora24:Int,min24:Int):Tempo
{
    var min12 = min24
    var hora12:Int
    var prefixo:Char
    
    if (hora24 == 0)
    {
        hora12 = 12
        prefixo = 'A'
    }
    else if (hora24 < 12)
    {
        hora12 = hora24
        prefixo = 'A'
    }
    else if (hora24 == 12)
    {
        hora12 = 12
        prefixo = 'P'
    }
    else
    {
        hora12 = hora24 - 12
        prefixo = 'P'
    }
    
    return Tempo(hora12,min12,prefixo)
}

fun imprimir(hora12: Int, min12: Int, prefixo: Char)
{
    println(String.format("Horario convertido: %02d:%02d %c.M",hora12,min12,prefixo))
}