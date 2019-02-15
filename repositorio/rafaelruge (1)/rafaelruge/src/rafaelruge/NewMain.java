/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelruge;

/**
 *
 * @author Equipo4sala11
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    empleados pq = new empleados("nombre","apellido","nss",1.0,0.4);
    pq.establecerPrimerNombre("");
    pq.obtenerPrimerNombre();
    pq.establecerApellidoPaterno("");
    pq.obtenerApellidoPaterno();
    pq.establecerNumeroSeguroSocial("");
    pq.obtenerNumeroSegurosocial();
    pq.establecerTarifaComision(0);
    pq.obtenerTarifaComision();
    pq.establecerVentasBrutas(0);
    pq.obtenerVentasBrutas();
    pq.toString();
}
    
    
}

