package Aula2_Exercicios;

import java.util.Scanner;

/**
 * Exercício 10 – Verificar se um valor está fora do intervalo [100, 200]
 * Utiliza operadores relacionais e lógicos para identificar se um número não 
 * pertence ao intervalo.
 * @author Luis
 */
public class Ex10_ForaDoIntervalo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        
        boolean foraDoIntervalo = (num < 100 || num > 200);
        
        System.out.println("O número "+num+" está fora do intervalo [100,200]? "+foraDoIntervalo);
        
    }
}