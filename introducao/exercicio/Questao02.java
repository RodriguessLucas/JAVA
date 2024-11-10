package introducao.exercicio;
import java.util.Scanner;
/*Leia dois valores inteiros identificados como variáveis A e B. 
Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável. */
public class Questao02 {
    public static int somar(int A, int B){
        return A+B;
    };

	public static void main(String[] args) {
	 	Scanner sc = new Scanner (System.in);
 
		int A, B;
 
 		A = sc.nextInt();
		B = sc.nextInt();
 		System.out.println("SOMA = " + somar(A,B));
        sc.close();
	}
    
}
