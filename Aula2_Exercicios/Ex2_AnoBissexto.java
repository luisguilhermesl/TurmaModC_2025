package Aula2_Exercicios;
import java.util.Scanner;

/**
 * Exercício 2 – Verificar se um ano é bissexto
 * Utiliza boolean para aplicar a regra de ano bissexto:
 * Divisível por 4 e não por 100, ou Divisível por 400.E
 * @author Luis
 */
public class Ex2_AnoBissexto {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = teclado.nextInt();
        
        boolean bissexto = ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0));
        
        System.out.println("O ano "+ano+" é bissexto? "+bissexto);

    }

}
