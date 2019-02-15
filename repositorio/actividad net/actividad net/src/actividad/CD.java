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
        Canciones[0]="A";
        Canciones[1]="B";
        Canciones[2]="C";
        Canciones[3]="D";
        Canciones[4]="E";
        Canciones[5]="F";
        Canciones[6]="G";
        Contador=con;
     }
     public String dame_cancion(String can,int con){
          //ystem.out.println(""+Canciones[con]);
       return Canciones[con];
     }
     public int numero_canciones(){
          //System.out.println(""+Canciones[2]);
        return Canciones.length;
     }
     public String graba_canciones(int con, String can){
          //System.out.println(""+Canciones[2]);
         return Canciones[con]=can;
    }
     public String agrega(int con,String can){
          //System.out.println(""+Canciones[3]);
         return Canciones[con]=can;
     }
     public int eliminar (){
          //System.out.println(""+Canciones[5]);
         return Canciones.length;
     }
     public void mostrar(){
           for(int j=0;j<Canciones.length;j++)
               System.out.println(Canciones[j]);
     }
     
}

     
         
     

    

