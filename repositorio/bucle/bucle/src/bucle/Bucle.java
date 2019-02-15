/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle;

import java.util.Scanner;

/**
 *
 * @author Software
 */
public class Bucle {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int num1, num2, num3, mayor, medio, menor;
        mayor=0;
        menor=0;
        medio=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el primer número: ");
        num1=lector.nextInt();
        System.out.println("Digite el segundo número: ");
        num2=lector.nextInt();
        System.out.println("Digite el tercer número: ");
        num3=lector.nextInt();
        
        if (num1==num2 && num1<num3){
          System.out.println("El primero y el segundo son iguales y menores que el tercero");
        }
        else{
          if (num1==num3 && num1<num2){
            System.out.println("El primero y el tercero son iguales y menores que el segundo");
          }
          else{
            if (num2==num3 && num2<num1){
              System.out.println("El segundo y el tercero son iguales y menores que el primero");
            }
            else{
              if (num1==num2 && num1>num3){
                System.out.println("El primero y el segundo son iguales y mayores que el tercero");
              }
              else{
                if (num1==num3 && num1>num2){
                  System.out.println("El primero y el tercero son iguales y mayores que el segundo");
                }
                else{
                  if (num2==num3 && num2>num1){
                    System.out.println("El segundo y el tercero son iguales y mayores que el primero");
                  }
                  else{
                    if (num1==num2 && num1==num3){
                      System.out.println("Los números son iguales");
                    }
                    else{
                      if (num1>num2 && num2>num3){
                        mayor=num1;
                        medio=num2;
                        menor=num3;
                       }
                       else{
                         if (num1>num3 && num3>num2){
                           mayor=num1;
                           medio=num3;
                           menor=num2;    
                         }
                         else{
                           if (num2>num1 && num1>num3){
                             mayor=num2;
                             medio=num1;
                             menor=num3;
                            }
                            else{
                              if (num3>num1 && num1>num2){
                                mayor=num3;
                                medio=num1;
                                menor=num2;
                              }
                              else{
                                if (num2>num3 && num3>num1){
                                  mayor=num2;
                                  medio=num3;
                                  menor=num1;  
                                }
                                else{
                                  if (num3>num2 && num2>num1){
                                    mayor=num3;
                                    medio=num2;
                                    menor=num1;  
                                  }
                                }                
                              }                      
                            }
                        }
                      }
                      System.out.println("El número mayor es: " + mayor);
                    System.out.println("El número del medio es: " + medio);           
                    System.out.println("El número menor es: " + menor);
                    }
                    
                }
                }
              }
            }
       }
    }
  }        
}


