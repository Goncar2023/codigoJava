/*    
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
public class if_and_else {
    public static void main(String[] args) {
        //IF y ELSE se utiliza para controlar el flujo de los programas en relación a CONDICIONES
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        //IF ANIDADO
        double promedio = 6.5;
        if (promedio >= 1.0 && promedio <= 7.0) { //Verifica que la nota este entre 1.0 y 7.0
            if (promedio >= 4.0) {
                System.out.println("APROBASTE la asignatura");
            } else {
                System.out.println("REPROBASTE la asignatura");
            }
        } else {
            System.out.println("La nota NO cumple con el rango");
        }
    }
}
