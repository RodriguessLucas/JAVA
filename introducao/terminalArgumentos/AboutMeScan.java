package introducao.terminalArgumentos;
import java.util.Scanner;

public  class AboutMeScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua altura (em metros, use ponto como separador):");
        String alturaString = scanner.nextLine();
        double altura = Double.parseDouble(alturaString); // Converte o valor para double

        System.out.println("Digite sua idade:");
        String idadeString = scanner.nextLine();
        int idade = Integer.parseInt(idadeString); // Converte o valor para int

        System.out.println("Olá, meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " m");

        scanner.close(); // Fecha o scanner para liberar o recurso
    }
}
