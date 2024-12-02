package introducao.exercicio;
import java.util.Scanner;
/*Leia 2 valores de ponto flutuante de dupla precisão A e B, 
que correspondem a 2 notas de um aluno. A seguir, calcule a média do 
aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (
A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 
10.0, sempre com uma casa decimal.
 */
public class Questao03 {
    public static double media(double A, double B){
      return (A*3.5 +B*7.5)/11;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B;

        A = sc.nextDouble();
        B = sc.nextDouble();

        System.out.printf("MEDIA = %.5f", media(A,B));
        System.out.println();
    }
}
