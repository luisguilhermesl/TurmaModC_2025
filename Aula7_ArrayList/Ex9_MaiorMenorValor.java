package Aula4_Exercicios;

import java.util.Scanner;

/**
 * 9. Solicitar ao usuário 7 números e identificar o maior e o menor 
 * valor digitados.
 * @author Luis
 */
public class Ex9_MaiorMenorValor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número 1: ");
        double numero = teclado.nextDouble();
        double maior = numero;
        double menor = numero;
        
        for(int i=2; i<=7; i++){
            System.out.println("Digite o número "+i+": ");
            numero = teclado.nextDouble();
            if(numero >= maior){
                maior = numero;
            }
            if(numero <= menor){
                menor = numero;
            }
        }
        System.out.println("O maior valor é: "+maior);
        System.out.println("O menor valor é: "+menor);
    }
}