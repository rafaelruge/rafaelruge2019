package matriz;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        int [][] matriz= new int[3][3];
        int[] sumafilas = new int[3];
        int[] sumacol = new int[3];
        int i,j,diagonal, diagonal2, filas,columnas;
        
        //Carga de la matriz
        System.out.println("ingrese los numeros para cargar en la matriz");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matriz[i][j]=lector.nextInt();
           }
        }
        
        // sumar filas y columnas y asignarlos en los vectores
           for(i=0;i<3;i++){
            filas=0;
            columnas=0;
            for(j=0;j<3;j++){
              sumafilas[i]=sumafilas[i]+matriz[i][j];
              sumacol[i]=sumacol[i]+matriz[j][i];
            }
            
              System.out.print(sumafilas[i]+ " ");
              
        }
          
        //sumar la diagona de posiciones iguales
        diagonal=0;
        i=0;
        while (i<=2){
         for(j=0;j<3;j++){
          if (i==j){
           diagonal=diagonal+matriz[i][j];   
          }
          i=i+1;
        }  
        //sumar la segunda diagonal
        System.out.println("la suma de la segunda diagonal es : ");
        diagonal2=0;
        j=2;
        for(i=0;i<=2;i++){
            diagonal2=diagonal2+matriz[i][j];
            j=j-1;
        }
        
        //mostra los vectores con las sumas
        System.out.println("la suma de las filas es: ");
        for(i=0;i<3;i++){
          System.out.println(sumafilas[i]);   
        }
        
        System.out.println("la suma de las columnas es: ");
        for(i=0;i<3;i++){
          System.out.println(sumacol[i]);   
        }
        
      //mostrar diagonales  
      System.out.println("la suma de la primera diagonal es: " + diagonal);
      System.out.println("la suma de la segunda diagonal es: " + diagonal2);   
    }
    }
    //hallar el numero mayor
    int mayor=0;
    int menor=90;
    int i,j;
    int temp=0;
    int aux=0;
    int i=0;
    while (i < matriz.length){
    
}
    
}
