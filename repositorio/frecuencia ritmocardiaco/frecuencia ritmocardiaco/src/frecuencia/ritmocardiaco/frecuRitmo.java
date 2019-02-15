/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frecuencia.ritmocardiaco;

/**
 *
 * @author ruger
 */
class frecuRitmo {
    private String nombre;
    private String apellido;
    private String Genero;
    private int dia, mes, año;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
    public void setdia(int Dia) {
        this.dia = Dia;
    }

    public void setmes(int Mes) {
        this.mes = Mes;
    }

    public void setaño(int Año) {
        this.año = Año;
    }

    public String getNombre() {
        return nombre;
    }

    
    
    public int getEdad(){
        int Dia = 25;
        int Mes = 02;
        int Año = 2018;
        int Hoy = 10000 * Año + 100 * Mes +  Dia;
        int Cumpleaños = 10000 * año + 100 * mes +  dia;
        
        return (int)(Hoy - Cumpleaños)/ 10000;
    }
    public int getMaximoRitmoCardiaco(){
        return 220 - getEdad();
    }
    public String getIntervaloRecomendadoDeRitmoCardiaco()
    {
    return String.format("[%.1f - %.1f]",
            (float) getMaximoRitmoCardiaco() * 0.50,
            (float) getMaximoRitmoCardiaco() * 0.80);
    }
}
