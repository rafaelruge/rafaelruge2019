/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

    
public class entrenador extends persona
{
    String IdFederacion;
    public entrenador(String nombre, String apellido, String idFederacion,int id,int edad) 
    {
       super(id, nombre, apellido, edad); 
       
       IdFederacion= idFederacion;
       
    }

       public void concentrarse(){
        System.out.println("estamos en concentracion en entrenador");
        
    }
    public void viajar(){
        System.out.println("estamos viajando en entrenador");
        
    }
    public void dirigir_partido(){
        System.out.println("estoy dirigiendo el partido en entrenador");
    }
    public void dirigir_entrenamiento(){
        System.out.println("estoy dirigiendo el entrenamiento en entrenador");
    }
}

