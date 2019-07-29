/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiana.pagung
 */
public class ExemploFor01 {
    public static void main(String[] args) {
        
        System.out.println("Exemplo1 variavel i dentro do espoco do for");
        for (int i = 0; i < 10; i++) {
            if(i == 6){
                continue;
            }
            if(i == 8){
                break;
            }
            System.out.println(i);
        }
   
        System.out.println("Exemplo2 variavel i fora do espoco do for");
        int i = 0;
        for ( ; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println(i);
        
        System.out.println("Exemplo3 variavel i fora do espoco do for e incremento dentro do espoco do for");
        int i2 = 0;
        for ( ; i2 < 10; ) {
            System.out.println(i2);
            i2++;
        }
        System.out.println(i2);
    }
}
