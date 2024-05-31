/*11. A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e número de filhos. Faça um procedimento que leia esses dados para um número não determinado de pessoas e retorne a média de salário da população, a média do número de filhos, o maior salário e o percentual de pessoas com salário até R$350,00.*/

fun main()
{
    var mediaPerc = pesquisa()
    
    println(String.format("Media salarial: %.2f", mediaPerc.media_salario))
    println(String.format("Media de filhos: %.0f", mediaPerc.media_filhos))
    println(String.format("Maior salario: %.2f", mediaPerc.maior_salario))
    println(String.format("Percentual de salario ate R$ 350,00: %.2f%%", mediaPerc.percentual))
}

data class MediaPerc(var media_salario:Float, var media_filhos:Float, var maior_salario:Float, var percentual:Float)

fun pesquisa():MediaPerc
{
    var count = 0
    var count2 = 0
    var media_salario = 0.0F
    var media_filhos = 0.0F
    var maior_salario = 0.0F

    println("Preencha os dados ou digite -1 nos dois campos para sair\n")
    
    do
    {
        print("Informe seu salario: ")
        var salario = readLine()!!.toFloat()
        print("Informe quantos filhos voce tem: ")
        var num_filhos = readLine()!!.toFloat()

        if (salario == -1.0F && num_filhos == -1.0F)
        {
            break
        }
        
        count2++
        
        media_salario += salario
        media_filhos += num_filhos

        if (salario > maior_salario)
        {
            maior_salario = salario
        }
        if (salario > 0.0 && salario <= 350.0F)
        {
            count++
        }
    }while(salario != -1.0F && num_filhos != -1.0F)

    if (count2 > 0) 
    {
        media_salario /= count2
        media_filhos /= count2
    }
    val percentual = (count*100.0F) / count2
    
    return MediaPerc(media_salario, media_filhos, maior_salario, percentual)
}
