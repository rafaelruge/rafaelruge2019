/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Soft2-01
 */
public class SegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int empleado = 0;
        int salario =0;
        int descuento = 0;
        int sueldo_mayor=0;
        int sueldo_menor=0;
        int suma_descuento=0;
        int promedio_salario;
       
        Scanner sala = new Scanner(System.in);
        
        System.out.println("contbilidad salario empleados");
        
        for (int Contador = 0; Contador <=8; Contador++){
            empleado = sala.nextInt();
            salario=salario+empleado;
            if (Contador == 0) {
            sueldo_mayor = empleado;
            sueldo_menor = empleado;
            } 
        
            else{
               if (empleado > sueldo_mayor){
                   sueldo_mayor = empleado;
                } 
               else {
                   if (empleado < sueldo_menor){
                   sueldo_menor = empleado;
                   }
                   
                   if (empleado >= 200000 && empleado <=500000){
                       descuento = empleado * 5 / 100;
                    }
                   else {
                       if(empleado>=40000 && empleado <=800000){
                           descuento = empleado *8/100;
                   }else {
                           if (empleado>=900000 && empleado <=500000){
                           descuento = empleado*50/100; 
                           }
                   else{ 
                           if(empleado>15000000){
                           descuento= empleado*10/10;
                        }
                      }
                   }              
                }
             }
           }
         }
     }
}   

              
                 
            
           
  