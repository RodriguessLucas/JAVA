import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o número da conta:");
            int numeroConta = scan.nextInt();
            
            System.out.println("Digite a agência:");
            String agencia = scan.next();
            
            scan.nextLine();
            System.out.println("Digite o nome do cliente:");
            String nomeCliente  = scan.nextLine();
            
            System.out.println("Digite seu saldo:");
            double saldo = scan.nextDouble();
            
            
            System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " +agencia
                    + ", conta " + numeroConta + " e seu saldo R$" + String.format("%.2f", saldo) + " já está disponível para saque!");
        }
    }
}
