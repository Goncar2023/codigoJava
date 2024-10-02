/*    
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
public class repaso {

 public static void main(String[] args) {
        /*
            ESTRUCTURAS REPETITIVAS
        */
        
        //WHILE - DO WHILE 
        //SE UTILIZAN CUANDO NO SE CONOCE 
        //CUANTAS VECES SE REPETIRA
        
        // FOR -> SE UTILIZA CUANDO SE CONOCE 
        //EL LIMITE
        
        for(int x = 0; x < 10; x++){
            if(x == 5){
                System.out.println("ES CINCO");
            }else{
                System.out.println("X: "+x);
            }
            
        }

        
        System.out.println("\n BUCLE WHILE");
        int a = 10;//Variable de control
        while(a > 0){
            System.out.println(a);
            a--;//DECREMENTAR
        }
        
        System.out.println("\n DO WHILE");
        int b = 0;
        do{
            System.out.println("B: "+b);
            b++;//INCREMENTAR
        }while(b < 10);
        
        boolean condicion = true;
        
        Scanner scn = new Scanner(System.in);
        while(condicion){
            System.out.println("MENU");
            System.out.println("\n 1.- Hola "
                    + "\n 2.- Adios "
                    + "\n 3.- Salir");
            System.out.print("INGRESE OPCION:");
            int opcion = scn.nextInt();
            
            switch(opcion){
                case 1 -> System.out.println("Hola");
                case 2 -> System.out.println("Adios");
                case 3 -> {
                    System.out.println("SALIENDO...");
                    condicion = false;
                }
                default -> System.out.println("OPCION NO VALIDA");
            }
            
            int nota = 4;
            
            //SE ELIMINA LAS LLAVES {}
            if(nota >= 4) System.out.println("APROBADO");
            
            /*
                NOMENCLATURAS
                camelCase -> nombreCompleto
                PascalCase -> NombreCompleto
                snake_case -> nombre_completo
                kebab-case -> nombre-completo
            */  
            
    } 

}