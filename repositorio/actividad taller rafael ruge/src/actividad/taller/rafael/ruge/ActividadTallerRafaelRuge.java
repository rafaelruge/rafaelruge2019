/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.taller.rafael.ruge;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class ActividadTallerRafaelRuge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1) Declara dos variables numéricas (con el valor que desees), 
        //muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
        int a=25;
        int b=60;
        System.out.println("El resultado de la suma es "+(a+b));
        System.out.println("El resultado de la resta es "+(b-a));
        System.out.println("El resultado de la multiplicación es "+(a*b));
        System.out.println("El resultado de la división es "+(b/a));
        System.out.println("el modulo es "+(a%b));   
    
    
        //2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
        //Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
        int c=14;
        int d=50;
        if (d>=c){
            if(d==c){
                System.out.println("Los numeros "+c+" y "+d+" son iguales");
                }else{
                System.out.println("El número "+c+" es mayor que el número "+d);
                }
            }else{
            System.out.println("El número "+c+" es mayor que el número "+d);
            }
        
    
       //3) Declara un String que contenga tu nombre, después 
       //muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca 
         //“Bienvenido Fernando”.
        String nombre="RAFAEL";
           System.out.println("Bienvenido "+nombre);
           
           //4) Modifica la aplicación anterior
           //,para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
    }
        static{ 
           String nombre=JOptionPane.showInputDialog("introduce un nombre");
           System.out.println("Bienvenido "+nombre);
    }
        static {
        //5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado 
        //(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
            String texto=JOptionPane.showInputDialog("Introduce un radio");
            double radio=Double.parseDouble(texto);
            double area=Math.PI*Math.pow(radio, 2);
             System.out.println("El area del circulo es "+area);
        }
        static {
        //{6) Lee un número por teclado e indica si es divisible entre 
        //2 (resto = 0). Si no lo es, también debemos indicarlo.
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero");
            int numero=sc.nextInt();
            if (numero%2==0){
                System.out.println("El numero "+numero+" es divisible entre 2");
             }else{
                System.out.println("El numero "+numero+" no es divisible entre 2");
            }
            {
                //7) Lee un número por teclado y muestra por consola, 
                //el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
                String texto=JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
                int codigo=Integer.parseInt(texto);
                char caracter=(char)codigo;
                System.out.println(caracter);
            }
            {
                //8) Modifica el ejercicio anterior, 
                //para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.
                String texto=JOptionPane.showInputDialog("Introduce un caracter ASCII");
                char caracter=texto.charAt(0);
                int codigo=(int)caracter;
                System.out.println(codigo);
            }
            {
              //9) Lee un número por teclado que pida el precio de un 
              //producto (puede tener decimales) y calcule el precio final con IVA. 
              //El IVA sera una constante que sera del 21%.
              final double IVA=0.21;
               String texto=JOptionPane.showInputDialog("Introduce el precio de un producto");
               double precio=Double.parseDouble(texto);
               double precioFinal=precio+(precio*IVA);
               System.out.println(precioFinal);
            }
            {
                //10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
                int num=1;
                while (num<=100){
                    System.out.println(num);
                    num++;
                }
                {
                //11) Haz el mismo ejercicio anterior con un bucle for.
                  //int num=1;
                   //for (int num=1;num<=100;num++){
                    //System.out.println(num);
                    }
                }
            }
        static {
            //12) Muestra los números del 1 al 100 (ambos incluidos) 
            //divisibles entre 2 y 3. Utiliza el bucle que desees.
            int num=1;
            while (num<=100){
            if (num%2==0 || num%3==0){
                System.out.println(num);
                }
            num++;
            }
        }
        static {
       // 13) Realiza una aplicación que nos pida un número de ventas a introducir, 
        //después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
            //Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
           Scanner sc = new Scanner(System.in);
           System.out.println("Introduce el número de ventas");
           int numVentas=sc.nextInt();
            int sumaVentas=0;
            for (int i=0;i<numVentas;i++){
                System.out.println("Introduce el precio de la venta "+(i+1));
                int venta=sc.nextInt();
                sumaVentas=sumaVentas+venta;
                 }
            System.out.println(sumaVentas);
             }
        static {
        //14) Realiza una aplicación que nos calcule una ecuación de segundo grado.
        //Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante 
        //(operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. 
        //Te recomiendo que uses mensajes de traza.
            String textoA=JOptionPane.showInputDialog("Introduce el valor de a");
            int a=Integer.parseInt(textoA);
            String textoB=JOptionPane.showInputDialog("Introduce el valor de b");
            int b=Integer.parseInt(textoB);
            String textoC=JOptionPane.showInputDialog("Introduce el valor de c");
            int c=Integer.parseInt(textoC);
            double discriminante=Math.pow(b, 2)-(4*a*c);
            System.out.println(">>"+discriminante);
            if (discriminante>0){
                double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
                double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
                System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
            }else{
                System.out.println("El discriminante es negativo");
            }
        }
        static {
        //15) Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
        //si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
            int codigo;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Introduce un numero mayor que 0");
                codigo=sc.nextInt();
                }while(codigo<=0);
            System.out.println(codigo);
            }
        }
    


            
        

           
    
    

    

