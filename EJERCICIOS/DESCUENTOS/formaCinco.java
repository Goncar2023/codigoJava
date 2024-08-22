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
        
        //Declaracion de variables
        int precio, opcion;
        
        System.out.print("INGRESE EL PRECIO DEL PRODUCTO: ");   
        if (numeros.hasNextInt()){ //VERIFICA SI LA ENTRADA ES UN N° ENTERO
            precio = numeros.nextInt();//OBTENER LO INGRESADO POR EL USUARIO
            
            //VALIDAR QUE EL PRECIO INGRESADO SEA MAYOR A CERO
            if(precio <= 0){ System.out.println("PRECIO NO VALIDO"); return; }
            
            //MENU DE OPCIONES
            System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
            System.out.println("         TIPOS DE CLIENTES");
            System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
            System.out.println(" 1.- CLIENTE REGULAR");
            System.out.println(" 2.- CLIENTE MIEMBRO");
            System.out.println(" 3.- CLIENTE VIP");
            System.out.println("=*=*=*=*=*=*=*=*=*=*==**=*=*=*=*=*=*=");
            System.out.print("INGRESE UNA OPCION: ");
            opcion = numeros.nextInt(); //ALMACENA LA OPCION INGRESADA POR EL USUARIO

            //EVALUAR LA OPCION NUMERICA INGRESADA POR EL USUARIO
            double descuento = switch (opcion){
                case 1 -> precio * 0.05;
                case 2 -> precio * 0.10;
                case 3 -> precio * 0.25;
                default -> 0;
            };
            
            if(descuento == 0){ System.out.println("OPCION SELECCIONADA INCORRECTA"); return; }

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
        }else{
            System.out.println("ERROR: FOR FAVOR, INGRESE SOLO NUMEROS");
        }
    }
}