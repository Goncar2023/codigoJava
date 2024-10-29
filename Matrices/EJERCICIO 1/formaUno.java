package arreglos;

import java.util.Scanner;

public class Arreglos {
    static Scanner numeros = new Scanner(System.in);
    static Scanner letras = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        //DEFINIR ARREGLOS 
        int arrayUno[][] = new int[3][2];
        int arrayDos[][] = new int[3][2];
        
        int sumaArreglos = 0;//VARIABLE DONDE SE ACUMULARA LA SUMA
        
        System.out.println("INGRESE NUMEROS AL PRIMER ARREGLO");
        for(int f=0; f < arrayUno.length; f++){ //FILAS
            for(int c=0; c < arrayUno[f].length; c++){ //COLUMNAS
                System.out.println("INGRESE NUMERO A ["+f+"]["+c+"]");
                arrayUno[f][c] = numeros.nextInt();
                sumaArreglos += arrayUno[f][c]; //ACUMULAR LA SUMA
            }
        }
        
        continuar();//LLAMAR A LA FUNCION
        System.out.println("");
        System.out.println("INGRESE NUMEROS AL SEGUNDO ARREGLO");
        for(int f=0; f < arrayUno.length; f++){ //FILAS
            for(int c=0; c < arrayUno[f].length; c++){ //COLUMNAS
                System.out.println("INGRESE NUMERO A ["+f+"]["+c+"]");
                arrayDos[f][c] = numeros.nextInt();
                sumaArreglos += arrayDos[f][c]; //ACUMULAR LA SUMA
            }
        }
        continuar();
        
        System.out.println("");
        System.out.println("LA SUMA ES: "+sumaArreglos);
        
        continuar();
    }

    private static void continuar() {
        System.out.println("PRESIONE TECLA PARA CONTINUAR....");
        String tecla = letras.nextLine();
    }
    
}
