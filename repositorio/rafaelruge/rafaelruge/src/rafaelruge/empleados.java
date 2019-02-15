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
class empleados extends Object
{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    
    public empleados(String nombre,String apellido, String nss, double ventas, double tarifa)
    {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        estableverVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }
 
    public void establecerPrimerNombre( String nombre )
    {
        primerNombre = nombre;
    }
    public String obtenerPrimerNombre()
    {
        return primerNombre;
        
    }
    public void establecerApellidoPaterno ( String apellido ){
        
        apellidoPaterno = apellido;
    }
    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
    }
    public void establecerNumeroSeguroSocial(String nss)
    {
        numeroSeguroSocial = nss;
    }
    public String obtenerNumeroSegurosocial()
    {
        return numeroSeguroSocial;
    }
    public void estableverVentasBrutas(double ventas)
    {
        if ( ventas >= 0.0 )
            ventasBrutas = ventas;
        else
            throw new IllegalArgumentException(
            "las Ventas brutas deben ser >= 0.0");
    }
    public double obtenerVentasBrutas()
    {
        return ventasBrutas;
    }
    public void establecerTarifaComision (double tarifa)
    {
        if (tarifa > 0.0 && tarifa < 1.0)
            tarifaComision = tarifa;
        else 
            throw new IllegalArgumentException  (
                    "la tarifa de comision debe ser > 0.0 y < 1.0");
    }
    public double obtenerTarifaComision()
    {
        return tarifaComision;
    }
    public double ingresos()
    {
        return tarifaComision * ventasBrutas;
    }
    public String toString()
    {
        return String.format("Xs: Xs Xs\nXs: Xs\nXS: X.2f\nXs :X.2f",
                "empleado por comision",primerNombre, apellidoPaterno,
                "numero de seguro social", numeroSeguroSocial,
                "ventas Brutas", ventasBrutas,
                "tarifa de comision", tarifaComision);
    }
   
}
