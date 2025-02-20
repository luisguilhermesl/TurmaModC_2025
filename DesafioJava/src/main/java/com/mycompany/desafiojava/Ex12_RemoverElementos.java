package com.mycompany.desafiojava;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Ex12_RemoverElementos {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
                i--;
            }
        }
        System.out.println(numeros);
    }
}