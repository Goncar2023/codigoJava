/*    
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
import java.util.Scanner; //IMPORTAR LA CLASE SCANNER

public class ejemploScanner {

    public static void main(String[] args) {
        /*
            La clase Scanner se utiliza para leer datos desde System.in o entrada
            estándar (TECLADO)
        */
    
        //Se define una INSTANCIA de tipo Scanner
        Scanner scanner = new Scanner(System.in);
    
        //Como ejemplo se solicitará al usuario ingresar su nombre y edad
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();//Se utiliza nextLine para leer TEXTO
    
        //Pedir al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); //se utiliza nextInt para leer ENTEROS
    
        //Se muestran los datos ingresados por el usuario
        System.out.println("Hola, " + nombre + ". Tu edad es: " + edad + " años.");
    
        //Se recomienda cerrar el elemento SCANNER al terminar de usarlo para liberar recursos
        scanner.close();
    }
    
}
