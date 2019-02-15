/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafael.ruge;

/**
 *
 * @author Rafaelruge
 */
public class carro {
    int Puertas;
    String color;
    String marca;
    private int precio;
    
    public void deportivo(int puertas){
        
        this.Puertas=puertas;
        
        System.out.println(this.Puertas);
    }
    
    public String acelerar(int Precio, String Marca){
        
        this.precio=Precio;
        this.marca=Marca;
        
        return "Ya acelera";
        
    }
    
    public int frenar(int Precio, String Marca){
        
        this.precio=Precio;
        this.marca=Marca;
        
        return 7;
    }
    
    public void utilitario(){
        
    }
    
}
