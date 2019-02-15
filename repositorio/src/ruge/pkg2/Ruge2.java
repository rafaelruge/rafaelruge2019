/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruge.pkg2;
import java.util.Scanner;
public class Ruge2 {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese la cantidad de filas: ");
        int FM=entrada.nextInt();
        for (int CC=1;CC<=FM;CC++){
            for (int CE=1;CE<=FM-CC;CE++){
                System.out.print(" ");
            }
            int cont1;
            for( cont1=1;cont1<=CC;cont1++){
                System.out.print(cont1);
            }
            for(cont1=CC-1;cont1>=1;cont1--){
               System.out.print(cont1);
            }
               System.out.println ();
        }
        int CP;
        for( CP=1;CP<5;CP++){
               System.out.println("AD"+CP);
        }
        System.out.print("AF"+CP);
    }   
}



