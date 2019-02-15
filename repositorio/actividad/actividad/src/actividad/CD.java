/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

/**
 *
 * @author Soft2-01
 */
public class CD
{
     String[]Canciones=new String [7];
     int Contador;
     
     public CD(String can,int con)
     {
        String Canciones[]={"A","B","C","D","E","F","G"};
         Contador=con;
     }
     public String dame_cancion(String can,int con){
       return Canciones[con];
     }
     public int numero_canciones(){
        return Canciones.length;
     }
     public String graba_canciones(){
         return;
    
}
}

     
         
     

    

