
package frecuencia.ritmocardiaco;


public class FrecuenciaRitmocardiaco {

    
    public static void main(String[] args) {
        frecuRitmo rit = new frecuRitmo();
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        
        System.out.print("Nombre: ");
        rit.setNombre(input.nextLine());
        
        System.out.print("Apellido: ");
        rit.setApellido(input.nextLine());
        
        System.out.print("Genero: ");
        rit.setGenero(input.nextLine());
        
        System.out.println("ingrese datos de fecha de nacimiento: ");
        
        System.out.print("Dia:  ");
        rit.setdia(input.nextInt());
        
        System.out.print(" mes: ");
        rit.setmes(input.nextInt());
        
        System.out.print("año: ");
        rit.setaño(input.nextInt());
        
        System.out.printf("Calculando...\n");
        System.out.printf("Nombre: %s%n",rit.getNombre());
        System.out.printf("Edad cumplida: %d%n", rit.getEdad());
        System.out.printf("Maximo ritmo cardiaco [bpm]: %d%n", rit.getMaximoRitmoCardiaco());
        System.out.printf("Intervalo recomendado de ritmo cardiaco: %s%n", rit.getIntervaloRecomendadoDeRitmoCardiaco());
             
    }
    
}
