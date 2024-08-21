/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
public class ZodiacoChino {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.print("INGRESE SU AÑO DE NACIMIENTO: ");

        if (numeros.hasNextInt()) {//VERIFICA SI LA ENTRADA ES UN N° ENTERO
            //Cuando el usuario ingresa algo y presiona Enter, 
            // scanner.hasNextInt() verifica si lo ingresado es un entero.
            int year = numeros.nextInt();
            
             if (year >= 1000 && year <= 2024) {
                int resto = year % 12;
                String signoChino = "";
                
                switch (resto){
                    case 0 -> signoChino = "Mono";
                    case 1 -> signoChino = "Gallo";
                    case 2 -> signoChino = "Perro";
                    case 3 -> signoChino = "Cerdo";
                    case 4 -> signoChino = "Rata";
                    case 5 -> signoChino = "Buey";
                    case 6 -> signoChino = "Tigre";
                    case 7 -> signoChino = "Conejo";
                    case 8 -> signoChino = "Dragón";
                    case 9 -> signoChino = "Serpiente";
                    case 10 -> signoChino = "Caballo";
                    case 11 -> signoChino = "Cabra";
                    default -> System.out.println("ERROR: HA OCURRIDO UN PROBLEMA");
                }

                System.out.println("SU SIGNO ZODIACAL CHINO ES: " +signoChino);
            } else {
                System.out.println("ERROR: EL AÑO DEBE SER POSITIVO Y DE 4 DIGITOS.");
            }
        } else {
            System.out.println("ERROR: POR FAVOR, INGRESE SOLO NUMEROS");
        }
    }
    
}
