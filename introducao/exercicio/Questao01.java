package introducao.exercicio;
import java.util.Scanner;
/*Você receberá dois valores inteiros. Faça a leitura e em seguida 
calcule o produto entre estes dois valores. Atribua esta operação à variável 
ROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).    
*/
public class Questao01 {

    public static int multiplicar(int A, int B){
        return A*B;
    }
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		A = sc.nextInt();
		B = sc.nextInt();
		PROD = multiplicar(A,B);    

		System.out.println("PROD = " + PROD  );
	}
    
}
