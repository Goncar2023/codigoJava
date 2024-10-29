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
        sumaArreglos = llenarArreglos(arrayUno); //ENVIAR ARREGLO
        
        System.out.println("INGRESE NUMEROS AL SEGUNDO ARREGLO");
        sumaArreglos += llenarArreglos(arrayDos);//ENVIAR EL SEGUNDO ARREGLO 
                
        System.out.println("LA SUMA ES: "+sumaArreglos);
        continuar();
    }

    private static void continuar() {
        System.out.println("");
        System.out.println("PRESIONE TECLA PARA CONTINUAR....");
        String tecla = letras.nextLine();
    }
                        //SE RECIBIRAN AMBOS ARREGLOS BAJO EL NOMBRE ARRAY
    private static int llenarArreglos(int[][] array) {
        //EN ESTE CASO SE SUMAN LOS ELEMENTOS DESPUES DE SER INGRESADOS
        int suma = 0;
        for(int f=0; f < array.length; f++){ //FILAS
            for(int c=0; c < array[f].length; c++){ //COLUMNAS
                array[f][c] = validarNumero(f,c); //FUNCION PARA VALIDAR EL NUMERO
                suma += array[f][c]; //SE ACUMULA LA SUMA DE CADA ELEMENTO
            }
        }
        continuar();//LLAMAR A LA FUNCION
        return suma;//SE RETORNA LA SUMA
    }

    private static int validarNumero(int fila, int columna) {
        int numero;
        do{
            System.out.print("INGRESE NUMERO A ["+fila+"]["+columna+"]: ");
            numero = numeros.nextInt();
            if(numero <= 0) System.out.println("ERROR: EL NUMERO DEBE SER MAYOR A CERO");;
        }while(numero <= 0);
        
        return numero;
    }
    
}