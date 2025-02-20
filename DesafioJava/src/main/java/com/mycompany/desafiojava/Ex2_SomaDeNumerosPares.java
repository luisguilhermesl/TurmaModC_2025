package com.mycompany.desafiojava;

/**
 *
 * @author Luis
 */
public class Ex2_SomaDeNumerosPares {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 20; i++) {
            if (i%2==0){
                soma +=i;
            }
        }
        System.out.println("A soma dos números pares é: " +soma);
    }
}
