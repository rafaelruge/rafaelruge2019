/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafael.ruge;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RafaelRuge {

    /**
     * @param args the command line arguments
     */
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      Scanner teclado= new Scanner (System.in);
       float suma, num;
      int i;
       suma=0;
       for(i=1; i<=10; i++){
      System.out.print("digite un numero:");
      num= teclado.nextFloat();
     suma=suma+num;}
        System.out.println("la suma es:" +suma);
    
    }
    
}
    

