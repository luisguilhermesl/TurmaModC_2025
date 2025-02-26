package Aula2_Exercicios;
import java.util.Scanner;

/**
 * Exercício 4 – Calcular a hipotenusa de um triângulo retângulo
 * Utiliza funções aritméticas da classe Math para calcular a hipotenusa.
 * @author Luis
 */

public class Ex4_Hipotenusa {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um valor do cateto a: ");
        double a = teclado.nextDouble();
        
        System.out.print("Digite um valor do cateto b: ");
        double b = teclado.nextDouble();
        
        //Calcula a hipotenusa usando Pitágoras: raiz (a² + b²)
        double hip = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("A hipotenusa é: "+hip);
        
    }
}