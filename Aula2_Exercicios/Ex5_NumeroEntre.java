package Aula2_Exercicios;

import java.util.Scanner;

/**
 * Exercício 5 – Verificar se um número está entre 10 e 20
 * Utiliza operadores relacionais e lógicos para checar o intervalo.
 * @author Luis
 */
public class Ex5_NumeroEntre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        
        boolean noIntervalo = (num >= 10 && num <= 20);
        
        System.out.println("O número "+num+ " está entre 10 e 20? "+noIntervalo);
    }
}