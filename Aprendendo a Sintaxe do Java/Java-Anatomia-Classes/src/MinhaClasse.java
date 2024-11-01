

/*Classe */
public class MinhaClasse{


    /*Método */
    public static void main(String args[]){  
        System.out.println("Hello World!");
        final String BRASIL = "Brasil";
        String primeiroNome = "Lucas";
        String segundoNome = "Rodrigues";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    };

    public static String nomeCompleto( String primeiroNome, String segundoNome){
        System.out.printf(primeiroNome + ' '+ segundoNome+ "\n");
        System.out.println(primeiroNome.concat(" ").concat(segundoNome));
        return  primeiroNome.concat(" ").concat(segundoNome);
    };

};