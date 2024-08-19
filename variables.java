/*    
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
public class variables {
    public static void main(String[] args) {
        //DECLARACION DE UNA VARIABLE
        String nombre; //TIPO_DATO NOMBRE_VARIABLE
        String apellido;
        
        //ASIGNACIÓN DE UNA VARIABLES
        nombre = "ALEJANDRO";
        apellido = "TORRES";
        
        //IMPRIMIR EL VALOR DE LA VARIABLE
        System.out.println("NOMBRE COMPLETO: "+nombre+" "+apellido);
        
        //DECLARAR Y ASIGNAR AL MISMO TIEMPO
        int edad = 24;
        System.out.println("EDAD: "+edad);
        edad = 18;
        System.out.println("EDAD 2: "+edad);
    }
}
