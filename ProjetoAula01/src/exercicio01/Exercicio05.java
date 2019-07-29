/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author fabiana.pagung
 */
public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe um número:");
        int valor1 = scn.nextInt();
        System.out.println("Informe outro número:");
        int valor2 = scn.nextInt();
        System.out.println(valor1+"-"+valor2+"="+(valor1-valor2));
    }
}
