# Escopo
    Tipos primitivos;
    Classificações;
    Escopo de uso;
    Palavras "opostas".

### Palavras reservadas
    São idenditicadores de uma linguagem que já possuem uma finalidade específica, portanto não poder ser ultilizados para nomear variáveis, classes métodos ou atributos.
    
    OBS: todas as palavras classificadas em grupos e escritas com letras minúsculas e identificadas por cores diferentes na IDE.

    OBS2: são 52 palavras reservadas.

### Controle de pacotes

    import: importa pacotes ou classes para dentro do código.

    package: especifica a que pacote todas as classe de um arquivo pertencem.

### Modificadores de acesso

    public: acesso de qualquer classe

    private: acesso apenas dentro da classe

    protected: acesso por classe no mesmo pacote e subclasses

## Tipos primitivo
    boolean, char, byte, double, float, int, short, long e void.

### Modificadores de classe, variáveis ou métodos
    abstract: classse que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata.

    class: especifica uma classe.

    extends: indica a superclasse que a subclasse está estendendo.

    final: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada.

    implements: indica as interfaces que uma classe irá implementar.

    interface: especifica uma interface.

    native: indica que um método está escrito em uma linguagem dependente de plataforma, como o C.

    new: instancia um novo objeto, chamando seu construtor.

    static: faz um método ou variável pertencer à classe ao invés de às instâncias.

    strictfp: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões.

    synchronized: indica que um método só pode ser acessado por uma thread de cada vez.

    transient: impede a serialização de campos.

    volatile: indica que uma variável pode ser alterada durante o uso de threads.

# Controle de fluxo dentro de um bloco de código

    break: sai do bloco de código que ele está.

    case: executa um bloco de código dependendo do teste do switch.

    continue: pula a execução do código que viria após essa linha e vai para próxima passagem de loop.

    assert, finally, throw, throws, try.

# Variáveis de referência
    super: refere-se a superclasse imediata
    this: refere-se a instância atual do objeto.

# Palavras "opostas"
    Existem algumas palavras que são completamente opostas no Java, conforme abaixo:
        package e import: Enquanto package determina o detório real da classe, o import informa de onde será importado a classe.

        extends e implements: enquanto extends determinas que uma classe estende, implement determina que uma classe implementa uma interface.

        final e abstract

        throws e throws

        




