
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
public class ExemploSwitch {
    public static void main(String[] args) {
        int dia = (new Scanner (System.in)).nextInt();
        switch(dia){
            case 2:{ 
                System.out.println("Segunda");
                System.out.println("Segunda linha"); break;
            
            } case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            default: System.out.println("Não útil");
            
        }
    }
    
}
