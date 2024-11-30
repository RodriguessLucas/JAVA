# Terminal e Argumentos

## Tópicos:
- Main args;
- Scanner;
- Execução via IDE;
- Execução via promt de comando.
<br>

### Terminal e Argumentos:
Com a Jvm devidamente configurada podemos disponibilizar o executavel para o usuário.

Quando executar o arquivo, gera um .class q é o executavel do código.

### Terminal    
- Para executarmos o código pelo promt de comando, precisamos:
    - usar o cd e o caminho para acessar
    - dir para ver quais os arquivos que há no diretório atua;l
    - digitar "java nomedoarquivo 
    Isso caso ele seja .class;
    - digitar java NomeArquivo.java
    Isso caso seja .java;

### Argumentos
Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [] de argumentos do tipo String. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo:

- java MinhaClasse agumentoUm argumentoDois

### Scanner
A abordagem de passar os argumentos pelo terminal pode resultar em erros.Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras agora vamos receber estes dados via Scanner.

A classe Scanner permite que o usuário tenha uma interação mais assertiva com o nosso programa. Vamos usar o arquivo AbouteMeScan.java



