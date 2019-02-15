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
public class masajista extends persona
{
    
    String Titulacion;
    int AñosdeExperiencia;
    public masajista( int id,String nombre,String apellido,int edad,String titulacion,int añosdeExperiencia)
       {
        super(id, nombre, apellido, edad);
        Titulacion = titulacion;
        AñosdeExperiencia = añosdeExperiencia;
    }
    public void concentrarse(){
        System.out.println("estoy concentrada en masajista");
    }
    public void viajar(){
        System.out.println("voy a viajar en masajista");
    }
    public void dar_masaje(){
        System.out.println("dare un masaje en masajista");
    }
}


