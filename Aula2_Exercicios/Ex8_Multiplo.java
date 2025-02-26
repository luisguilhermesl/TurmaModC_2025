package Aula2_Exercicios;

import java.util.Scanner;

/**
 * 
 * Exercício 8 – Verificar se um número é múltiplo de 3 ou de 7
 * Utiliza o operador módulo junto com operadores lógicos para determinar a condição.
 * @author Luis
 */
public class Ex8_Multiplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        
        boolean multiplo = (num % 3 == 0) || (num % 7 ==0);
        
        System.out.println("O número "+num+" é multiplo de 3 ou 7?" +multiplo);
        
    }
}