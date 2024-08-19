/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
public class switch_case {
    public static void main(String[] args) {
        //CONDICIONAL SWITCH
        int diaSemana = 2;
        /*
        SWITCH se utiliza en JAVA para seleccionar UNA de las múltiples opciones
        según el valor de la expresión, en este caso evaluará la variable diaSemana
        */
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Es fin de semana");
        }
    }
}
