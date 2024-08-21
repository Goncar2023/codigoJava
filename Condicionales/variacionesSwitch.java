/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
public class variacionesSwitch {
    public static void main(String[] args) {
        //SWITCH USANDO CADENAS
        String fruta = "Pera";

        switch (fruta) {
            case "Pera":
                System.out.println("Es una Pera!");
                break;
            case "Platano", "PLATANO":
                System.out.println("Es un Platano!");
                break;
            case "Naranja":
                System.out.println("Es una naranja!");
                break;
            case "Uva", "UVA","uva", "uVa":
                System.out.println("Es una uva!");
                break;
            default:
                System.out.println("Fruta desconocida.");
                break;
        }

        //SWITCH - CASE EXPRESIONES
        switch (fruta) {
            case "Pera" -> System.out.println("Es una Pera!");
            case "Platano", "PLATANO" -> System.out.println("Es un Platano!");
            case "Naranja" -> System.out.println("Es una naranja!");
            default -> System.out.println("Fruta desconocida.");
        }

        //MULTIPLES VALORES PARA UN CASE
        int mes = 4;

        String estacion = switch (mes) {
            case 12, 1, 2 ->"VERANO";
            case 3, 4, 5 -> "OTOÑO";
            case 6, 7, 8 -> "INVIERNO";
            case 9, 10, 11 -> "Otoño";
            default -> "Mes inválido";
        };

        System.out.println("La estación es: " + estacion);

    }
}