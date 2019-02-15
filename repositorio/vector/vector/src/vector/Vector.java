/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
         float[] carga= new float[10];
         int i;
         for (i=0;i<=9;i++){
             System.out.print("Digite un numero:");
             carga[i]=sc.nextFloat();
          }
         i=9;
         System.out.println("El vector cargado es:");
         while (i>=0){
             System.out.print(carga[i]);
             i=i-1;
         }
    }
    
}
