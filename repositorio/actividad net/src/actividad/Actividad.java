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
public class Actividad  {

    
      public static void main(String[] args) {
          CD cd = new CD("",2);
          cd.getCanciones();
          cd.getContador();
          String canci=cd.dame_cancion("", 1);
          System.out.println(canci);
          int canc=cd.numero_canciones();
          System.out.println(canc);
          String cancin=cd.graba_canciones(2,"juan");
          System.out.println(cancin);
          String ca=cd.agrega(5,"camilo");
          System.out.println(ca);
          int cent=cd.eliminar();
          System.out.println(cent);
          cd.mostrar();
        
      
}
}