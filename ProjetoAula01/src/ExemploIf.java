
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiana.pagung
 */
public class ExemploIf {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x<0)
            System.out.println("Negativo");
        else if (x<10){
            System.out.println("Positivo");
            System.out.println("Menor que dez");
        } else  
            System.out.println("Maior ou igual a dez");   
    }
}
