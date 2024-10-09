/*
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia y pega el código que se encuentra dentro de la clase main de este archivo y
        pegalo dentro de la clase main de tu proyecto.
*/
public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //DECLARAR Y CREAR ARREGLOS
        String[] nombres = new String[5]; //EL 5 INDICA QUE SE CREARA UN ARREGLO CON 5 POSICIONES
        String[] apellidos = new String[5];
        
        //INGRESAR DATOS AL ARREGLO DE FORMA DINAMICA
        for(int i = 0; i < nombres.length; i++){
            System.out.println("INGRESE NOMBRE EN LA POSICION "+i);
            /*
                toUpperCase() PERMITE CONVERTIR EL TEXTO A MAYUSCULAS
                toLowerCase() PERMITE CONVERTIR EL TEXTO A MINUSCULAS
            */
            nombres[i] = scn.nextLine().toUpperCase(); 
            System.out.println("INGRESE APELLIDO EN LA POSICION "+i);
            apellidos[i] = scn.nextLine().toUpperCase();
            System.out.println("");
        }
        
        //MOSTRAR LOS DATOS DEL ARREGLO DE FORMA DINAMICA
        for(int i = 0; i < nombres.length; i++){
            System.out.println("NOMBRE COMPLETO: "+nombres[i]+" "+apellidos[i]);
        }
        
       /*   BUSCAR DATO EN UN ARREGLO           */
        
       System.out.println("INGRESE EL NOMBRE A BUSCAR");
       String busqueda = scn.nextLine().toUpperCase();
       boolean encontrado = false;

       for(int x = 0; x < nombres.length; x++){
           //EQUALS para comparar strings
           if(busqueda.equals(nombres[x])){
               System.out.println("NOMBRE ENCONTRADO: "+nombres[x]+" "+ apellidos[x]);
               encontrado = true;
               break; //Salir del bucle si se requiere mostrar una sola coincidencia
           }
       }
       //SI NO SE ENCONTRÓ EL NOMBRE
       if(!encontrado) System.out.println("NOMBRE NO ENCONTRADO");
}