/*15. Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:

(1) – inserir um contato
(2) – Remover um contato
(3) – Editar um contato
(4) – buscar um contato pelo Código.*/

fun main(){

    var max_pessoas = 100
    var n_campo = 3
    var pessoas = Array(max_pessoas){Array(n_campo){""}}
    var op:Int
    var op_1:Int
    var codigo:String
    var fim:Int
    var count_pessoas = 0

    for (w in 0 until max_pessoas)
    {
        do
        {
            print("Escolha uma opcao a seguir.\n\n(1)  inserir um contato\n(2)  Remover um contato\n(3)  Editar umcontato\n(4)  buscar um contato pelo Codigo\n(5)  Mostrar lista\n");
            op = readLine()!!.toInt()

            when (op){
                1 ->{ //(1) – inserir um contato

                    for (i in 0 until max_pessoas){
                        print("Informe o codigo da pessoa: ")
                        pessoas[i][0] = readLine()!!
                        print("Informe o numero de telefone da pessoa: ")
                        pessoas[i][1] = readLine()!!
                        print("Informe q idade da pessoa: ")
                        pessoas[i][2] = readLine()!!
                        print("Deseja inserir mais uma pessoa ? Digite 0 para 'nao' e 1 para 'sim': ")
                        fim = readLine()!!.toInt()
                        count_pessoas++

                        if (fim == 0)
                        {
                            break
                        }
                    }
                }
                2 -> {//(2) – Remover um contato
                    
                    print("Informe o codigo da pessoa que deseja remover: ")
                    codigo = readLine()!!

                    for (i in 0 until max_pessoas){

                        if (pessoas[i][0] == codigo){

                            var posicao_remover = i

                            for (j in posicao_remover until max_pessoas - 1)
                            {
                                pessoas[j][0] = pessoas[j+1][0]
                                pessoas[j][1] = pessoas[j+1][1]
                                pessoas[j][2] = pessoas[j+1][2]
                            }
                            println("Contato removido com sucesso.")
                            count_pessoas--// Decrementa o contador de pessoas
                            break// Sai do loop após remover o contato
                        }
                    }
                }
                3 -> { //(3) – Editar um contato
                    
                    print("Informe o codigo da pessoa que deseja editar: ")
                    codigo = readLine()!!

                    for (i in 0 until max_pessoas)
                    {
                        if (pessoas[i][0] == codigo)
                        {
                            print("Informe qual campo deseja editar\n\n(1) Codigo\n(2) Telefone\n(3) Idade ")
                            op_1 = readLine()!!.toInt()

                            when (op_1){

                                1 -> {
                                    print("Informe o novo codigo da pessoa: ")
                                    pessoas[i][0] = readLine()!!
                                    println("Contato editado com sucesso.")
                                }    
                                2 -> {
                                    print("Informe o novo numero de telefone da pessoa: ")
                                    pessoas[i][1] = readLine()!!
                                    println("Contato editado com sucesso.")
                                }    
                                3 -> {
                                    print("Informe a nova idade da pessoa: ")
                                    pessoas[i][2] = readLine()!!
                                    println("Contato editado com sucesso.")
                                }    
                                else -> {
                                    println("Valor invalido.")
                                }
                            }
                            break 
                        } 
                    }
                }
                4 -> { //(4) – buscar um contato pelo Código
                    
                    print("Informe o codigo da pessoa que deseja buscar: ")
                    codigo = readLine()!!

                    for (i in 0 until max_pessoas){
                    
                        if (pessoas[i][0] == codigo)
                        {
                            println("${pessoas[i][0]}\n${pessoas[i][1]}\n${pessoas[i][2]}")
                        }
                    }
                }
                5 -> { //(5) – Mostrar lista

                    for (i in 0 until count_pessoas){
                    
                        println("codigo da pessoa: ${pessoas[i][0]}")
                        println("telefone: ${pessoas[i][1]}")
                        println("idade: ${pessoas[i][2]}")
                    }
                }
                else -> {
                    println("Erro: escolha entre 1 a 4.")
                }
            }
        } while (op > 5 || op < 1)

        print("Deseja realizar mais alguma operacao ? Digite 0 para 'nao' e 1 para 'sim': ")
        fim = readLine()!!.toInt()

        if (fim == 0){
            
            break
        }
    }
    return
}