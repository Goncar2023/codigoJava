/*    
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
import java.util.Scanner;//IMPORTAR LA CLASE SCANNER

public class ejercicioScanner {
    public static void main(String[] args) {  
        /*
            FORMULARIO DE REGISTRO
            SOLICITAR AL USUARIO EL INGRESO DE:
            - NOMBRE
            - APELLIDO
            - EDAD
            - ALTURA MTS
            - N° TELEFONO 
            - CORREO
            - CIUDAD
            - DIRECCION
            - DIA, MES Y AÑO DE NACIMIENTO 
            
            MOSTRAR LA INFORMACION
            - NOMBRE COMPLETO
            - EDAD
            - ALTURA
            - N° TELEFONO
            - DIRECCION, CIUDAD
            - FECHA DE NACIMIENTO DD/MM/YYYY
            - CORREO
              
        */
        
        //DECLARACION DE VARIABLES
        String nombre, apellido, telefono, correo;
        int edad;
        double altura;
        String direccion, ciudad;
        int dia, year, mes;
        
        //VARIABLES DE TIPO SCANNER
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        
        //SOLICITAR DATOS
        System.out.print("INGRESE SU NOMBRE: ");
        nombre = letras.nextLine();
        
        System.out.print("INGRESE SU APELLIDO: ");
        apellido = letras.nextLine();
        
        System.out.print("INGRESE SU EDAD: ");
        edad = numeros.nextInt();
        
        System.out.print("INGRESE SU CORREO: ");
        correo = letras.nextLine();
        
        System.out.print("INGRESE SU TELEFONO: ");
        telefono = letras.nextLine();
        
        System.out.print("INGRESE SU ALTURA: ");
        altura = numeros.nextDouble();
        
        System.out.print("INGRESE SU CIUDAD: ");
        ciudad = letras.nextLine();
        System.out.print("INGRESE SU DIRECCION: ");
        direccion = letras.nextLine();
        
        System.out.print("INGRESE DIA DE NACIMIENTO: ");
        dia = numeros.nextInt();
        System.out.print("INGRESE MES DE NACIMIENTO: ");
        mes = numeros.nextInt();
        System.out.print("INGRESE AÑO DE NACIMIENTO: ");
        year = numeros.nextInt();
        
        //MOSTRAR INFORMACION
        System.out.println("NOMBRE COMPLETO: "+nombre+" "+apellido);
        System.out.println("EDAD: "+edad);
        System.out.println("ALTURA: "+altura);
        System.out.println("N° TELEFONO: "+telefono);
        System.out.println("CORREO: "+correo);
        System.out.println("DIRECCION: "+direccion+" ,"+ciudad);
        System.out.println("FECHA DE NACIMIENTO: "+dia+"/"+mes+"/"+year);
                 
    }   
}
