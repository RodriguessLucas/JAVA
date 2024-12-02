package escopo_e_condicionais_em_java.estruturas_condicionais.condicao_simples;
public class caixaEletronico {
    public static void main(String[] args) {
        double saldo = 500;
        double valorSolicitacao = 17;

        if(valorSolicitacao < saldo){
            saldo -=valorSolicitacao;
            System.out.println("Saque com sucesso!");
        }
        else{
            System.out.println("Não foi possível sacar");
        }
        System.out.println(valorSolicitacao +" " + saldo);
    }
    
}
