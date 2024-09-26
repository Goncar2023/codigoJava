/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/

public class funciones {

    public static void main(String[] args) {
        /*
            METODOS O FUNCIONES
            Son fragmentos de código reutilizables que pueden ser llamados (invocados) 
            desde otras partes del programa.
            Se utilizan para dividir un programa en piezas más pequeñas y manejables, 
            lo que facilita la: 
            1.- Organización de código
            2.- Reutilización de código
            3.- Mantenimiento del programa
        */
        
        saludar();//LLAMADO AL METODO
        String nombre  = "JUAN";
        String apellido = "PEREZ";
        
                              //PARÁMETROS
        saludoPersonalizado(nombre, apellido);
        
        int numUno = 10, numDos = 20, resultado = 0;
        resultado = sumar(numUno, numDos);
        System.out.println("EL RESULTADO ES: "+resultado);
        

    }
    
    //Método que no devuelve ningún valor void -> VACÍO
    private static void saludar() {
        System.out.println("");
    }
    
    //Método con parámetros, se reciben en orden y se debe especificar el tipo de dato
    private static void saludoPersonalizado(String nombre, String apellido) {
        System.out.println("NOMBRE COMPLETO: "+nombre+" "+apellido);
    }
    
    //Método con parámetros y retorno
    //SE DEBE ESPECIFICAR EL TIPO DE RETORNO, EN ESTE CASO INT
    private static int sumar(int numUno, int numDos) {
        return numUno + numDos;
    }
}