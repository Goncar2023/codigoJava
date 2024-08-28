/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
import java.util.Scanner;

public class EdadMetrosUno {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        boolean bucle= true;
        
        while (bucle == true){System.out.println("elija una opcion: \n1.- Clasificador de edad \n2.- conversor de unidades \n3.- Salir");
            while (!leer.hasNextInt()){leer.next();System.out.println("Ingrese numeros");}
            int opcion1 = leer.nextInt();
        
            switch (opcion1){
                case 1 -> {
                    System.out.println("Ingrese su edad");
                    while (!leer.hasNextInt()){leer.next();System.out.println("Ingrese una edad valida");}
                    int edad= leer.nextInt();
                    if (edad >= 0 && edad <= 12){System.out.println("NIÑO/A");}
                        else if (edad > 12 && edad <= 17){System.out.println("ADOLESCENTE");}
                            else if (edad > 17 && edad <= 64){System.out.println("ADULTO");}
                                else if (edad > 64) {System.out.println("ADULTO MAYOR");}
                                    else {System.out.println("ERROR: ingrese una edad valida");}}
                case 2 -> {
                    System.out.println("ingrese la cantidad a cambiar en metros: ");
                    while (!leer.hasNextInt()){leer.next();System.out.println("Ingrese numeros");}
                    float metros = leer.nextFloat();
                    float conversion=0;
                    System.out.println("elija una unidad de conversion: \n1.-metro a Kilometros \n2.-metro a Centimetros \n3.- metro a Milimetros");
                    while (!leer.hasNextInt()){leer.next();System.out.println("Ingrese numeros");}
                    int opcion2 = leer.nextInt();
                    switch (opcion2){
                        case 1 -> {conversion= metros / 1000;}
                        case 2 -> {conversion= metros * 100;}
                        case 3 -> {conversion= metros * 1000;}
                        default -> {System.out.println("ERROR");}}
                    System.out.println("el resultado de la conversion es: "+conversion);}
                case 3-> bucle= false;
                default -> System.out.println("ELIJA UNA OPCION VALIDA");
            }
        }
    }
}