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
public class futbolistas extends persona
{
    
    int Dorsal;
    String Demarcacion;
    public futbolistas(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion)
    {
        super(id, nombre, apellido, edad);
        Dorsal = dorsal ;
        Demarcacion = demarcacion;
    }
    
    public void concentrarse(){
        System.out.println("estoy en concentracion en futbolistas");
    }
    public void viajar(){
        System.out.println("estoy viajando en futbolistas");
    } 
    public void jugar_partido(){
        System.out.println("estoy jugando partido en futbolistas");
    }
   public void entrenar(){
       System.out.println("estoy entrenando en futbolistas");
   }
   
}



