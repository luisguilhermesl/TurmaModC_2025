package Aula4_Exercicios;
import java.util.Random;
import java.util.Scanner;

/**
 * 10. Jogo de Adivinhação: DESAFIO - Gerar um número aleatório entre 1 e 100 e 
 * solicitar ao usuário que adivinhe o número, fornecendo dicas (maior ou menor) 
 * a cada tentativa. Limitar o número de tentativas a 7.
 * @author Luis
 */
public class Ex10_JogoAdivinhacao {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner teclado = new Scanner(System.in);
        
        int numero = rm.nextInt(100); 
        int tentativas;
        int palpite = 0;
        
        System.out.println("tente adivinhar o número entre 1 e 100!");
        
        for(tentativas = 1; tentativas <= 7; tentativas++){
            System.out.println("Tentativa "+tentativas+": ");
            palpite = teclado.nextInt();
            
            if (palpite == numero){
                System.out.println("Parabéns! Você acertou em "+tentativas+" tentativas");
                break;
            }else if(palpite < numero){
                System.out.println("O número é maior");
            }else{
                System.out.println("O número é menor");
            }
        }
        if(palpite != numero){
            System.out.println("Você não conseguiu adivinhar o número.\nO número era "+numero);
        }
    }
}