/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
/**
 * tiposDatos
 */
public class tiposDatos {
    public static void main(String[] args) {
        /*
            Los tipos de datos primitivos especifican el tamaño
            y el tipo de los valores de las variables.
        */
    
        //Booleano -> Solo puede ser VERDADERO o FALSO
        boolean booleano=true;
    
        //Almacenan un solo carácter
        char caracter='A'; //Utiliza comillas simples
        System.out.println("Valor Carácter ="+caracter);
    
        //Almacena un número entero sin fracciones ni decimales
        int entero = 10;
        System.out.println("Valor Entero ="+entero);
        long largo = 125362133223L; //La L indica que es de tipo long
        System.out.println("Valor Largo ="+largo);
    
        //Tipo flotante
        //La diferencia está en la cantidad de números que "caben" en cada uno de estos formatos
        float flotante = 65.20298f; //32 Bits -> Precisión simples
        //La F indica que es de tipo float //SUFIJO
        //Puede representar números con una precisión aproximada de 7 cifras decimales.
    
        double decimal = 876.765d;  //64 Bits -> Precisión exacta
        //Puede representar números con una precisión aproximada de 15 cifras decimales.
    
        /*
            FLOAT se utiliza cuando se necesita ahorrar memoria en grandes arreglos de números en coma 
            flotante y no se requiere una alta precisión.
            DOUBLE se utiliza cuando se necesita una mayor precisión en los cálculos. 
            Es el tipo de dato por defecto para números en coma flotante en Java.
        */
    
    
        String nombre = "Walter White"; //Utiliza comillas dobles
        System.out.println("Datos Personales");
        System.out.println("Nombres: "+nombre);
    }
    
}
