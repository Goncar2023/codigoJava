/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/

public class calculadoraBucles {
    public static void main(String[] args) {
        //Elementos scanner
        Scanner numeros = new Scanner(System.in);
        
        double numUno = 0, numDos = 0, resultado = 0;
        boolean continuar = true; //Para controlar el bucle
        int opcion;//Almacenar la opcion del usuario
        
        while(continuar){
            //Menú de opciones
            System.out.println("CALCULADORA");
            System.out.println("1.- Suma");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
            System.out.print("Ingrese OPCION: ");
            opcion = numeros.nextInt();
            
            //Si el usuario decide salir, no se le pedirá el ingreso de los numeros
            if(opcion < 5){
                System.out.println("");
                System.out.print("Ingrese el primer numero: ");
                numUno = numeros.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                numDos = numeros.nextDouble();
            }
        
            System.out.println("======================================");
            
            //Evaluar la opcion seleccionada por el usuario
            switch(opcion){
                case 1 -> { 
                    resultado = numUno + numDos;
                    System.out.println("La SUMA es: "+resultado);
                }
                case 2 -> {
                    resultado = numUno - numDos;
                    System.out.println("La RESTA es: "+resultado);
                }
                case 3 -> {
                    resultado = numUno * numDos;
                    System.out.println("La MULTIPLICACION es: "+resultado);
                }
                case 4 -> {
                    resultado = numUno / numDos;
                    System.out.println("La DIVISION es: "+resultado);
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    continuar = false;
                }
                default -> System.out.println("Opcion Invalida");
            }
            System.out.println("======================================");
            System.out.println("");
        }
    }
}