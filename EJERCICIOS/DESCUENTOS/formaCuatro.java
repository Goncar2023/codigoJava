/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
public class formaUno {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        System.out.print("INGRESE EL PRECIO DEL PRODUCTO: ");
        int precio = numeros.nextInt(); //OBTENER LO INGRESADO POR EL USUARIO
        
        //MENU DE OPCIONES
        System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
        System.out.println("         TIPOS DE CLIENTES");
        System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
        System.out.println(" 1.- CLIENTE REGULAR");
        System.out.println(" 2.- CLIENTE MIEMBRO");
        System.out.println(" 3.- CLIENTE VIP");
        System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
        System.out.print("INGRESE UNA OPCION: ");
        int opcion = numeros.nextInt(); //ALMACENA LA OPCION INGRESADA POR EL USUARIO
        
        System.out.println("");
        System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
        
        double descuento = 0, precioDesc = 0;
        switch (opcion){ //EVALUAR LA OPCION NUMERICA INGRESADA POR EL USUARIO
            case 1:
                precioDesc = precio * 0.95;
                System.out.println("CLIENTE REGULAR - DESCUENTO DEL 5%");
                break;
            case 2:
                precioDesc = precio * 0.90;
                System.out.println("CLIENTE MIEMBRO - DESCUENTO DEL 10%");
                break;
            case 3:
                precioDesc = precio * 0.75;
                System.out.println("CLIENTE VIP - DESCUENTO DEL 25%");
                break;
            default:
                System.out.println("OPCION INCORRECTA");
                return; //SALIR DEL PROGRAMA SI LA OPCION ES CORRECTA UTILIZANDO RETURN
        }
        
        //MOSTRAR RESULTADOS
        System.out.println("PRECIO INICIAL: $"+precio);
        System.out.println("PRECIO FINAL: $"+precioDesc);
        System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
        System.out.println("");   
    }
}