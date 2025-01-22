# Tema **QLang**, grupo **qlang-q07**
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | Participação |
|:---:|:---|:---:|
|  98584 | AFONSO SILVA CASTANHETA | 0.0% |
| 103477 | INÊS NUNES SANTOS | 33.3% |
|  98543 | LUÍS PEDRO DA SILVA SOARES OLIVEIRA | 0.0% |
|  98620 | PEDRO DUARTE SOARES FERREIRA | 0.0% |
| 102567 | PEDRO GIL COSTA AZEVEDO | 33.3% |
| 103009 | RÚBEN FILIPE PEREIRA LOPES | 33.3% |

## Relatório

-    As linguagens estão separadas em pastas diferentes
    
    Linguagem primaria -> /primary 
    
    Linguagem secundária -> /secondary


-   Linguagem Primária 
        
    Criação da gramatica com base nos ficheiro p1.q e p2.q.
    O 'QlangCompiler' compila o código do ficheiro p1.q todo corretamente, criando assim um Output.java' que ao ser executado cria o ficheiro result.txt.
    O ficheiro p2.q só consegue compilar o código até à linha 6.
    Foi criada uma tabela de simbolos, que no futuro poderia ser utilizada para análise semântica(não implementada).
    Alteração à 'QlangMain' para receber um nome de ficheiro como parametro de entrada e criação do 'Output.java' com o código gerado pelo Visitor.


-   Linguagem Secundaria

    A gramática passa os testes feitos a todos os ficheiros de exemplo
    Os ficheiros p1.pil,p2.pil e p3.pil estão a ser devidamente processados, embora não exista uma análise semântica, tendo esta sido feita em momentos pontuais no 'PilInterpreter' (incompleta).
    Implementação de uma tabela de simbolos, Class 'Type' e Class 'Value', que eventualmente seriam utilizadas para a análise semântica
    Alteração a 'PilMain' para receber um nome de ficheiro como parametro de entrada

## Contribuições

- Previamennte, tinhamos dividido o trabalho em grupos de 3 pessoas (1 grupo encarregue da linguagem secundária, e outro encarregue da linguagem principal). No entanto, no dia 4 de junho, os colegas Afonso,Luís e Pedro, encarregues da linguagem principal, decidiram desistir do trabalho, dando-nos permissão para lhes atribuir uma percentagem de 0% nas suas contribuições, visto
que eles optaram por não entregar o trabalho para a época normal. E, por consequência, foi-nos permitido estender o prazo de entrega para dia 10 de junho.

- O trabalho da linguagem principal deixado pelos nossos colegas não nos facilitou a continuação do trabalho, de maneira que tivemos que refazer a linguagem principal de raiz.

- Os membros que restaram trabalharam igualmente para a entrega final do programa, tendo assim sido atribuida a mesma percentagem de contribuição para todos 