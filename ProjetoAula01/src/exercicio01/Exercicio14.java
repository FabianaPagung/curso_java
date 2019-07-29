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
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Informe a base do retangulo:");
        double base = scn.nextDouble();
        System.out.println("Informe a altura do retangulo:");
        double altura = scn.nextDouble();
        
        double perimetro = 2*(base+altura);
        System.out.println("Perimetro do retangulo:"+ perimetro);
        
        double area = base*altura;
        System.out.println("Área do retangulo:"+ area);
    }
}
