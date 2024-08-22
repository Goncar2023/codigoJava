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
        
        double descuento = 0;
        //EVALUAR LA OPCION NUMERICA INGRESADA POR EL USUARIO
        switch (opcion){
            case 1 -> descuento = precio * 0.05;
            case 2 -> descuento = precio * 0.10;
            case 3 -> descuento = precio * 0.25;
            default -> System.out.println("OPCION INCORRECTA");         
        }
        
        //CALCULAR EL PRECIO CON DESCUENTO
        double precioDesc = precio - descuento;
        
        //MOSTRAR RESULTADOS
        System.out.println("");
        System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
        System.out.println("PRECIO INICIAL: $"+precio);
        System.out.println("DESCUENTO: $"+descuento);
        System.out.println("PRECIO FINAL: $"+precioDesc);
        System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
        System.out.println(""); 
    }
}