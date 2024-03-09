/*22. A ACME Inc., uma empresa de 500 funcionários, está tendo problemas de espaço em disco no seu servidor de arquivos. Para tentar resolver este problema, o Administrador de Rede precisa saber qual o espaço ocupado pelos usuários, e identificar os usuários com maior espaço ocupado. Através de um programa, baixado da Internet, ele conseguiu gerar o seguinte arquivo, chamado "usuarios.txt":

alexandre       456123789
anderson        1245698456
antonio         123456456
carlos          91257581
cesar           987458
rosemary        789456125

Neste arquivo, o nome do usuário possui 15 caracteres. A partir deste arquivo, você deve criar um programa que gere um relatório, chamado "relatório.txt", no seguinte formato:
Relatório de Uso do Espaço em Disco

Nr.	Usuário	    Espaço utilizado	Percentual do uso
    
1	alexandre	434,99 MB	        16,85%
2	anderson	1187,99 MB	        46,02%
3	antonio	    117,73 MB	        4,56%
4	carlos	    87,03 MB	        3,37%
5	cesar	    0,94 MB	            0,04%
6	rosemary	752,88 MB	        29,16%
    
Espaço total ocupado:	2581,57 MB
Espaço médio ocupado:	430,26 MB
  
O arquivo de entrada deve ser lido uma única vez, e os dados armazenados em memória, caso sejam necessários, de forma a agilizar a execução do programa. A conversão da espaço ocupado em disco, de bytes para megabytes deverá ser feita através de uma função separada, que será chamada pelo programa principal. O cálculo do percentual de uso também deverá ser feito através de uma função, que será chamada pelo programa principal.*/

import java.text.DecimalFormat

fun main(){

    var nome = arrayOf("Alexandre", "Anderson", "Antonio", "Carlos", "Cesar", "Rosimary")
    var espaco_util = arrayOf(456123789.0f, 1245698456.0f, 123456456.0f, 91257581.0f, 987458.0f, 789456125.0f)
    var percentual = FloatArray(6)
    var total = 0f

    for (i in 0 until 6){
        
        espaco_util[i] = espaco_util[i] / 1000000f
        total += espaco_util[i]
    }

    var media = total / 6f

    for (i in 0 until 6){
        
        percentual[i] = (espaco_util[i] * 100f) / total
    }

    println("Relatorio de Uso do Espaco em Disco\n")
    println("Nr.	Usuario	    Espaco utilizado	Percentual do uso")

    for (i in 0 until 6){
        
        var espaco_utilfor = DecimalFormat("#.##")
        var espaco_utilforr = espaco_utilfor.format(espaco_util[i])
        var percentualfor = DecimalFormat("#.##")
        var percentualforr = percentualfor.format(percentual[i])
        println("${i + 1}     ${nome[i]}      ${espaco_utilforr} MB               ${percentualforr} %")
    }
    var totalfor = DecimalFormat("#.##")
    var totalforr = totalfor.format(total)
    var mediafor = DecimalFormat("#.##")
    var mediaforr = mediafor.format(media)

    println("Espaco total ocupado: ${totalforr} MB")
    println("Espaco medio ocupado: ${mediaforr} MB")

    return

}