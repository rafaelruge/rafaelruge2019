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
public class  persona 
{
    int ID;
    String Nombre;
    String Apellido;
    int Edad;
        
    public persona( int id,String nombre,String apellido,int edad)
    {
       
        Nombre = nombre;
        Apellido = apellido;
        ID = id;
        Edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public void concentrarse(){
        System.out.println("estoy en concentracio en persona");
    }
    public void vijar(){
        System.out.println("estoy viajando en persona");
    }
  
}    
    

