package com.mycompany.desafiojava;

/**
 *
 * @author Luis
 */
public class Ex7_SomaDeDigitos {
    public static void main(String[] args) {
        int numero = 13;
        int soma = 0;
        while(numero>0){
            int digito = numero / 5;
//            numero /= 10;
//            numero *= 5;
//            numero -= 10;
//            soma += numero;
            
            //int digito = numero % 5;
         //->   //soma += digito;
           // numero /= 10;
        }
        System.out.println("A soma dos dígitos é: "+soma);
    }
}


