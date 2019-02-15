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
          CD cd = new CD("",02);
          cd.getCanciones();
          cd.getContador();
          cd.dame_cancion("", 0);
          cd.numero_canciones();
          cd.graba_canciones();
          cd.agrega();
          cd.eliminar();
      
}
}