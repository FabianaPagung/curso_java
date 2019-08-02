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
public class Exercicio18 {
        public static void main(String[] args) {
        
        double valorPi = 3.141592;
            
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o raio da base da lata de óleo:");
        double valorBase = scn.nextDouble();
        System.out.println("Informe a altura da lata de óleo:");
        double valorAltura = scn.nextDouble();
        
        double volume = valorPi*(valorBase*valorBase)*valorAltura;
        System.out.println("O Volume da lata de óleo é:"+ volume);
        
    }
}
