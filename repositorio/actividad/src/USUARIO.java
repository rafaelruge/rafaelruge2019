
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soft2-01
 */
public class USUARIO {
    String Nombre;
    String Apellido;
    String Numerocuenta;
    String Direccion;
    String Login;
    String Password;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNumerocuenta(String Numerocuenta) {
        this.Numerocuenta = Numerocuenta;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNumerocuenta() {
        return Numerocuenta;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }
    public void enviar_sugerencia(){
        JOptionPane.showMessageDialog(null,"Estoy En Enviar Sugerencia");
    }
    public void leer(){
        JOptionPane.showMessageDialog(null,"Estoy en Leer");
    }
    public void comprar(){
        JOptionPane.showMessageDialog(null,"Estoy En Comprar");
    }
    public void vender(){
        JOptionPane.showMessageDialog(null,"Estoy En Vender");
    }
    public void realizar_reclamacion(){
        JOptionPane.showMessageDialog(null,"Estoy En Realizar Reclamacion");
    }
}
