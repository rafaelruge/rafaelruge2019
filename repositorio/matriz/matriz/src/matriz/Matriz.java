/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author ruger
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        int matriz [][]= new int[50][50];
        int i,j,sumfila=0,sumcolumna=0,sumdiagonal=0,fila,columna,diagonal;
        
        
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                matriz[i][j]=(int)Math.floor(Math.random()*(9-1+1)+1);
           }
        }
        System.out.print("La matriz ingresada es ");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                matriz[i][j]=(int)Math.floor(Math.random()*(9-1+1)+1);
                }
        }
        System.out.println("La matriz ingresada es ");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println("Que fila desea sumar ");
        fila=lector.nextInt();
        for(i=0;i<5;i++){
            sumfila=sumfila+matriz[fila-1][i];
        }
        System.out.println("que diagonal desea sumar");
        columna=lector.nextInt();
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                sumdiagonal=sumdiagonal+matriz[columna-1][i];
            }
        }
        System.out.println("La suma de la fila "+fila+" es ="+sumfila);
        
        System.out.println("\nQue colimna desea sumar ");
        columna=lector.nextInt();
        for(i=0;i<5;i++){
            sumcolumna=sumcolumna+matriz[i][columna-1];
        }
        System.out.println("la suma de la columna "+columna+" es = "+sumcolumna);
   
    }
    
    
    
}
