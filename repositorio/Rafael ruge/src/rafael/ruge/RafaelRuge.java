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
public class RafaelRuge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      carro Ford=new carro();
       Ford.deportivo(15);
      carro Veloz=new carro();
      String ver= Veloz.acelerar(300000, "Ford GT 40");
      System.out.println(ver);
      
      carro Quieto=new carro();
      int fre=Quieto.frenar(110000, "Ford GT 40");
      System.out.println(fre);
      
      carro Util=new carro();
      System.out.println("Estoy en utilitario");
     
    }
}