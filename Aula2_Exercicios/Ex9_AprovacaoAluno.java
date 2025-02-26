package Aula2_Exercicios;

import java.util.Scanner;

/**
 * 
 * Exercício 9 – Verificar se um aluno foi aprovado na disciplina
 * Critérios: nota maior ou igual a 60 e frequência maior ou igual a 75%.
 * @author Luis
 */
public class Ex9_AprovacaoAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno: ");
        double nota = teclado.nextDouble();
        
        System.out.print("Digite a frequência do aluno (em %): ");
        double frequencia = teclado.nextDouble();
        
        boolean aprovado = (nota >= 60 && frequencia >=75);
        
        System.out.println("O aluno foi aprovado? "+aprovado);
    }
}