/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruge.pkg3;

/**
 *
 * @author Usuario
 */
public class Ruge3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int A[]={3,6,5,1001,32,28,56};
               //System.out.println("El tamaño es: "+A.length);
                for(int indice=0; indice<A.length;indice++){
                System.out.println("El valor de el indice "+indice+ " es: "+A[indice]);
        }*/
        int A[][]={{3,6,5,70,02},{2,8,1},{10,15,30}};
               System.out.println(A.length);
               for (int i=0; i<A.length; i++){
                   for(int j=0; j<A[i].length; j++){
                       System.out.println("El valor de i: "+i+" y j: "+j+" es: "+A[i][j]);
                   }
}
}
}
        

        
