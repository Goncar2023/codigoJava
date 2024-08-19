/*    
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
public class opAritmeticos {
    public static void main(String[] args) {
        /*
            Operadores Aritméticos:
            Estos operadores se utilizan para realizar operaciones matemáticas.
    
            +: Suma.
            -: Resta.
            *: Multiplicación.
            /: División.
            %: Módulo (resto de la división).
        */
       
    
        //Declaración de variables que almacenarán los resultados
        int suma, resta, multiplicacion, division, resto;
        //Declaración y asignación
        int a = 20;
        int b = 10;
    
        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;
        resto = a % b;
    
        System.out.println("");
        System.out.println("===============================");
        System.out.println("*         RESULTADOS          *");
        System.out.println("===============================");
        System.out.println("SUMA de A + B = "+suma);
        System.out.println("RESTA de A - B = "+resta);
        System.out.println("MULTIPLICACIÓN de A * B = "+multiplicacion);
        System.out.println("DIVISIÓN de A / B = "+division);
        System.out.println("Módulo de A % B = "+resto);
        System.out.println("");
    
        
        int z = 4;
    
        //INCREMENTO (++)
        z++; //Incrementa Z en 1
        System.out.println("Después de INCREMENTAR Z: " + z); //Resultado: 5
    
        //DECREMENTO (--)
        z--; // Decrementa Z en 1
        System.out.println("Después de DECREMENTAR Z: " + z); // Resultado: 4
    
    }
}