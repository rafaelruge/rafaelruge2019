/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatematicas;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author Rafaelruge
 */
public class ProyectoMatematicas {

    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Imagen obj = new Imagen();
        boolean imageio = ImageIO.write(obj.redimensionar("leon.jpg", 6.2), "jpg", new File("new.jpg"));
    
    }
    
}
