/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

/**
 *
 * @author Equipo4sala11
 */
public class futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        masajista mas = new masajista(235,"","",45,"",6);
      mas.getNombre();
      mas.getApellido();
      mas.getEdad();
      mas.getID();
      mas.vijar();
      mas.viajar();
      mas.dar_masaje();
    
    entrenador ent= new entrenador("","","",6,5);
    
    ent.getNombre();
    ent.getNombre();
    ent.getEdad();
    ent.getID();
    ent.viajar();
    ent.concentrarse();
    ent.dirigir_entrenamiento();
    ent.dirigir_partido();
    
    futbolistas fut =new futbolistas(2,"","",1,3,"");
    fut.getNombre();
    fut.getApellido();
    fut.getEdad();
    fut.getID();
    fut.concentrarse();
    fut.viajar();
    fut.jugar_partido();
    fut.entrenar();
}
}
