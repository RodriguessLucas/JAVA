# Tipos e variaveis:

### Explorar os tipos de dados númericos, lógicos, caracteres e suas aplicabilidades.

- No Java, existem algumas palavras reservadas para representação
    dos tipos de dados básicos que precisam ser manipulados para a construção
    de programas. Estes tipos de dados são conhecidos como tipos primitivos

- Os tipos primitivos em Java são:
        -int, byte, short, long, float, double. boolean e char.
    OBS: representam valores brutos e são armazenados na pilha de memória,
    e não sao considerados objetos.

-  > Capacidades de cada tipo primitivo:

       Tipo        memória     valor min.      valor max.
        byte        1 byte      -128            127
        short       2 bytes     -32768          32768
        int         4 bytes     -2147483648     2147484648
        long        8 bytes     -9 quintilhoes
        float       4 bytes     -3,4029E+38     +3,4029E+38
        double      8 bytes     -1,7976E+308    +1,7976E+308

    OBS:
     Apesar o float ocupar metate da memoria consumida do que o tipo double, ele é menos ultilizado. Ele sofre uma limitação que compromete seu uso em determinada situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

    Da mesma forma o tipo long, é comum ultilizar o int pois já satisfaz a maioria dos problemas.

    Sempre no tipo float termine a atribuição com F, para que entenda q é decimal flaot pi = 3.14F;
    - Sempre no tipo long termina a atribuição com L, para que entenda que é long.

            long cpf = 939439329349L;

### Declaração de variáveis:
A variavel é composta por:

- > <tipo> <nomeVariavel> = <atribuição>
- exemplos:
    int idade = 19;
    double salarioMinimo = 12312.493;
    
- Casting: conversão entre tipos que de maior capacidade de armazenamendo paramenor.
 Exemplo: de int para short; shor valor = (short) idade;


- Variaveis e constantes:
    - Constantes são valores armazenados na memória que não podem 
        ser modificados depois de declarado, usando a palavra reservada
        final e o nome da variavel em maiúcula por convenção.

    - Variveis são valores armazenados na memória que podem ser modificados depois de declarados.
