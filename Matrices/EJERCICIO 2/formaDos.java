package arreglos;

import java.util.Scanner;

public class Arreglos {
    static Scanner numeros = new Scanner(System.in);
    static Scanner letras = new Scanner(System.in);
    
    public static void main(String[] args) {
        //SOLICITAR LAS FILAS Y LAS COLUMNAS AL USUARIO
        int filas = validarNumero("FILAS");
        int columnas = validarNumero("COLUMNAS");
        
        continuar();
        
        //DEFINIR ARREGLOS 
        int arrayNumeros[][] = new int [filas][columnas];
        int arrayTranspuesta[][] = new int[columnas][filas];
        
        //RELLENAR EL ARREGLO "ORIGINAL"
        for(int f=0; f < filas; f++){ //FILAS
            for(int c=0; c < columnas; c++){ //COLUMNAS
                System.out.print("INGRESE NUMERO A ["+f+"]["+c+"]: ");
                arrayNumeros[f][c] = numeros.nextInt();
            }
        }
        
        continuar();
        
        //CREAR LA MATRIZ TRANSPUESTA
        for(int f=0; f < filas; f++){ //FILAS
            for(int c=0; c < columnas; c++){ //COLUMNAS
                arrayTranspuesta[c][f] = arrayNumeros[f][c];
            }
        }
        
        System.out.println("");
        System.out.println("ORIGINAL");
        //MOSTRAR LA MATRIZ ORIGINAL
        for(int f=0; f < filas; f++){ //FILAS
            for(int c=0; c < columnas; c++){ //COLUMNAS
                System.out.print(arrayNumeros[f][c]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("TRANSPUESTA");
        //MOSTRAR MATRIZ TRANSPUESTA
        for(int f=0; f < columnas; f++){ //FILAS
            for(int c=0; c < filas; c++){ //COLUMNAS
                System.out.print(arrayTranspuesta[f][c]+" ");
            }
            System.out.println("");
        }
        
        continuar();
    }
    
    private static int validarNumero(String texto) {
        int numero;
        do{
            System.out.println("INGRESE LA CANTIDAD DE "+texto);
            numero = numeros.nextInt();
            if(numero <= 0) System.out.println("ERROR: EL NUMERO DEBE SER MAYOR A CERO");;
        }while(numero <= 0);
        return numero;
    }
    
    private static void continuar() {
        System.out.println("");
        System.out.println("PRESIONE TECLA PARA CONTINUAR....");
        String tecla = letras.nextLine();
    }
}
