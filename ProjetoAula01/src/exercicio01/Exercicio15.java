/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Exercicio15 {
       public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Informe a base do triangulo:");
        double base = scn.nextDouble();
        System.out.println("Informe a altura do triangulo:");
        double altura = scn.nextDouble();
        
        double area = (base*altura)/2;
        System.out.println("Área do triangulo:"+ area);
        
    }
}
