/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeras_listasruge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Primeras_listasRuge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<String>pais;
       pais = new ArrayList<>();
       pais.add("colombia");
       pais.add("argentina");
       pais.add("peru");
       pais.add("brasil");
       pais.add("bolivia");
       
        System.out.println(pais.get(0));
        System.out.println(pais.get(1));
        System.out.println(pais.get(2));
        System.out.println(pais.get(3));
        System.out.println(pais.get(4));
    }
    
}
