

### ASSUNTOS ABORDADOS 
### 1 - Estrutura Inicial;
### 2 - Padrão de nomenclatura;
### 3 - Declarando Variaveis e Métodos;
### 4 - Identação;
### 5 - Organização de Arquivos;
### 6 - Java Beans.


    1 - Estrutura inicial(Anatomia das classes):
        "Uma classe bem estruturada não quer guerra com ninguém"

        A escrita de códigos de um programa é feito através da composição
        de palavras pré-definidas pela linguagem com as expressões que ultilizamos
        para determinar o nome dos nossos arquivos, classes, atributos
        e métodos;

        - Classe: define um TIPo de objeto, ou seja, representa a estrutura de dados
        (atributos, construtores, métodos).

        - Métodos: são criados definindo seu tipo de retorno, como por exemplo
        void(vazio).

        - Obejto: é uma instancia criada a partir de uma determinada clasee.
        Após instanciar o objeto é possivel declarar valores aos atributos
        e chamar os métodos.

        - Atributos: são as caracteristicas de um objeto, tambem chamada de 
        variaveis, como por exemplo: nome, idade, peso, etc.

    


    2 - Padrão de nomenclatura:

        - Ao criar um arquivo.java, sempre começe com letra maiuscula
        e nomes compostos mantenha a primeira letra maiuscula. 
        Por exemplo: Minha, MinhaClasse.

        -Cada classe "é um arquivo" e dento de cada classe 
        haverá métodos("funções por exemplo").
        Ou seja, o nome da classe deve ser o mesmo do arquivo.java.
        Caso não seja, a ide ja acusa erro.
        
        - Método principal de Execução(main)

        - Variavel deve ser escrita com letra minuscula, caso seja palavra composta
        deve ter a palava maiuscula. Exemplo: ano, AnoFabricacao.
        Famoso "camelCase"
            OBS: quando queremos indicar que a variavel  não sofrera alteração
            definimos o nome com letras maiusculas, caso seja composto, será tudo
            maiuscula e separado por underline. Exemplo: BRASIL, BR_SCORE
            
            usamos o final para definir como variavel imutavel,
            exemplo: final String BRASIL = "Brasil";
        
        - Declarações inválidas:
            int numero&um 
            int 1numero
            int numero um
            int long

            forma correta:
            int numero$um
            int numero1
            int numeroum
            int longo

    3 - Declarando variaveis e métodos:
        estrutura:
            tipo NomeBemDefinido = atribuição(opcional em certos casos)
            exemplo:
                int idade = 32;
                double altura = 1.54;
                dog spyke;
                boolean simOuNao = true;
                altura = 5.23;

        declarando métodos:
        Estrutura:
            TipoRetorno NomeObjetivoNoInfinito Parametro(s)
            exemplo:
            int somar(int numeroUm, int numero2);
            String formatarCep (long cep);
            
    4 - Identação:
        Estrategia de tabular o código para que possa ter uma Organização a 
        nivel de escopo. Não interfere no código, apenas na visualização.(no caso do java);

    5 - Organização de Arquivos:
        À medida que nosso sistema vai evoluindo, surgem novos arquivos(código fonte)
        em nossa estrutura de arquivos do projeto. Isso exige que seja realizado a organização 
        do código através de pacotes(packages).

        Usa abreviações para ogranizar os pacotes. 
        Exemplo: comercial(com.), Estoque lojaX(est.lojaX.)
                edu.lucas.tema.controlefluxo
                edu.lucas.primeirasemana
        isso em pastas, ou seja, ficaria algo como:
            edu\lucas\tema\primeirasemana
            visualização na IDE:
            edu
                lucas
                    tema
                        primeirasemana
    6 - Java Beans:
        Uma das maiores dificuldade na programação é escrever algoritmos legíveis
        a níveis que sejam compreendidos por todo seu tiem ou por você mesmo no 
        futuro. Para isso a linguagem Java surege, através de convenções, formas de
        escrita universal para nossas classes, atributos, métodos e pacotes.

        variavel:
            Deve ser clara, sem aberviações ou definição sem sentido;
            É sempre no singular, exceto quando referir a array ou coleção;
            Defina um idioma unico para todo o projeto;

        Métodos:
            Deverão ser nomeados como verbos, toda primeira letra será minuscula,
            e nomes compostos serão tudo junto e cada inicial em maiuscula.
            Exemplo: abrir(){} , imprimirInverso(){}

        

        



        



        
