package Aula2_Exercicios;

import java.util.Scanner;

/**
 * Exercício 3 – Verificar se uma pessoa pode dirigir
 * A pessoa deve ter 18 anos ou mais e possuir carteira de motorista (CNH).
 * @author Luis
 */
public class Ex3_PodeDirigir {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();
                
        
        System.out.print("Você possui carteira de motorista [true/false]? ");
        boolean temCNH = teclado.nextBoolean();
        
        boolean podeDirigir = (idade >= 18) && temCNH;
        
        //Responder com Sim ou Não
        String resp;
        if(podeDirigir){
            resp = "sim";
        }else{
            resp = "não";
        }
        
        System.out.println("A pessoa pode dirigir? "+resp);
    }
}