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

    public String[] getCanciones() {
        return Canciones;
    }

    public void setCanciones(String[] Canciones) {
        this.Canciones = Canciones;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }
     String[]Canciones=new String [7];
     int Contador;
     
     public CD(String can,int con)
     {
        String Canciones[]={"A","B","C","D","E","F","G"};
         Contador=con;
     }
     public String dame_cancion(String can,int con){
          System.out.println("estoy en dame cancion");
       return Canciones[con];
     }
     public int numero_canciones(){
          System.out.println("estoy en numero canciones");
        return Canciones.length;
     }
     public String[] graba_canciones(){
          System.out.println("estoy en graba canciones");
         return Canciones;
    }
     public String [] agrega(){
          System.out.println("estoy en agrega");
         return Canciones;
     }
     public int eliminar (){
          System.out.println("estoy en eliminar");
         return Canciones.length;
     }
}

     
         
     

    

