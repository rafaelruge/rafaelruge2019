/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruge;

/**
 *
 * @author B17
 */
public class Ruge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prog1();

prog2();

prog3();

prog2();

prog1();

}

static void prog3(){

String result = "";

String simbolo = "1";

String espacio = " ";

 

for (int cont = 1; cont<5; cont++){

result= result+simbolo;

}

System.out.print(result);

}

 

static void prog2(){

String result = "";

String simbolo = "1";

String espacio = " ";

 

for (int cont = 1; cont<=5;cont++){

if(cont>1 && cont<5){

result= result+simbolo;

}else{  

result= result+espacio;

}  

}

System.out.println(result);

} 

static void prog1(){

String result = "";

String simbolo = "2";

String espacio = " ";

 

for (int cont = 3; cont<6;cont++){

if(cont== 1 || cont== 5){

result= result+simbolo;}

 

if (cont != 1 && cont!=5){

result= result+espacio;

}  

}

System.out.println(result);

}  

