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
            //LA VARIABLE I INDICARA LA POSICION DONDE SERÁ ALMACENADO EL NOMBRE INGRESADO POR EL USUARIO
            nombres[i] = scn.nextLine();
            System.out.println("INGRESE APELLIDO EN LA POSICION "+i);
            apellidos[i] = scn.nextLine();
            System.out.println("");
        }
        
        //MOSTRAR LOS DATOS DEL ARREGLO DE FORMA DINAMICA
        for(int i = 0; i < nombres.length; i++){
            System.out.println("NOMBRE COMPLETO: "+nombres[i]+" "+apellidos[i]);
        }
}