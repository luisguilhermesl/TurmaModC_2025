package Aula2_Exercicios;

import java.util.Scanner;

/**
 * Exercício 1 – Verificar se um número é par
 * Utiliza boolean para determinar se um número inteiro é par.
 * @author Luis
 */
public class Ex1_NumPar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int num = teclado.nextInt();
        
        //Verificar se o número é par
        boolean par = (num % 2 == 0);
        
        System.out.println("O número "+num+" é par? " +par);
        
        teclado.close();
    }
}
