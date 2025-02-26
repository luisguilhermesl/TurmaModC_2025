package Aula2_Exercicios;

import java.util.Scanner;

/**
 * Exercício 6 – Determinar o maior de dois números
 * Utiliza operadores relacionais para comparar dois valores.
 * @author Luis
 */
public class Ex6_MaiorNumero {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int num2 = teclado.nextInt();
        
        if(num1 > num2){
            System.out.println("O maior número é: "+num1);
        }else if(num2 > num1){
            System.out.println("O maior número é: "+num2);
        }else{
            System.out.println("Os número são iguais.");
        }
    }
}