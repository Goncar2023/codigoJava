package arreglos;

import javax.swing.JOptionPane;

public class Arreglos {
    
    public static void main(String[] args) {
        //SOLICITAR LAS FILAS Y LAS COLUMNAS AL USUARIO
        int filas = validarNumero("FILAS"); //VALIDAR NÚMERO DE FILAS
        int columnas = validarNumero("COLUMNAS"); //VALIDAR NÚMERO DE COLUMNAS
        
        //DEFINIR ARREGLOS 
        int[][] arrayNumeros = new int[filas][columnas]; //ARREGLO ORIGINAL
        int[][] arrayTranspuesta = new int[columnas][filas]; //MATRIZ TRANSPUESTA
        
        //RELLENAR EL ARREGLO "ORIGINAL"
        rellenarArreglo(arrayNumeros, filas, columnas);
        
        //CREAR LA MATRIZ TRANSPUESTA
        transponerMatriz(arrayNumeros, arrayTranspuesta, filas, columnas);
        
        //MOSTRAR MATRIZ ORIGINAL
        mostrarArreglo(arrayNumeros, "ARREGLO ORIGINAL", filas, columnas);
        
        //MOSTRAR MATRIZ TRANSPUESTA
        mostrarArreglo(arrayTranspuesta, "ARREGLO TRANSPUESTO", columnas, filas);
    }
    
    //VALIDAR NÚMERO Y RETORNARLO
    private static int validarNumero(String texto) {
        int numero;
        do {
            String input = (String) JOptionPane.showInputDialog(
                null, 
                "INGRESE LA CANTIDAD DE " + texto + ":", //MENSAJE A MOSTRAR
                texto, //TÍTULO DEL CUADRO DE DIÁLOGO
                JOptionPane.PLAIN_MESSAGE, //TIPO DE MENSAJE
                null, 
                null, 
                "Ingresa aquí" //TEXTO DEL INPUT
            );

            //VERIFICA SI EL USUARIO PRESIONÓ CANCELAR
            if (input == null)mensajeError("OPERACIÓN CANCELADA", "SALIENDO...");
            
            try {
                numero = Integer.parseInt(input);//CONVERTIR EL TEXTO A INT

                //VERIFICAR SI EL NÚMERO ES MAYOR A CERO
                if (numero <= 0) mensajeAdvertencia("EL NÚMERO DEBE SER MAYOR A CERO");
                
            } catch (NumberFormatException e) {
                //CONTROLAR QUE SE INGRESEN NÚMEROS
                mensajeAdvertencia("SE DEBEN INGRESAR SOLO NÚMEROS"); //MENSAJE DE ADVERTENCIA
                numero = -1; //INICIALIZAR A UN VALOR INVÁLIDO
            }
        } while (numero <= 0);
        return numero; //RETORNAR NÚMERO VALIDADO
    }
    
    //RELLENAR EL ARREGLO CON NÚMEROS
    private static void rellenarArreglo(int[][] array, int filas, int columnas) {
        for (int f = 0; f < filas; f++) { // FILAS
            for (int c = 0; c < columnas; c++) { // COLUMNAS
                String input = (String) JOptionPane.showInputDialog(
                    null, 
                    "\n INGRESE NÚMERO A [" + f + "][" + c + "]: \n", //MENSAJE A MOSTRAR
                    "RELLENANDO EL ARREGLO", //TÍTULO DEL CUADRO DE DIÁLOGO
                    JOptionPane.PLAIN_MESSAGE, //TIPO DE MENSAJE
                    null, 
                    null, 
                    "Ingresa aquí" //TEXTO DEL INPUT
                );

                //VERIFICA SI EL USUARIO PRESIONÓ CANCELAR
                if (input == null) mensajeError("OPERACIÓN CANCELADA", "SALIENDO..."); //MENSAJE DE ERROR Y SALIDA
                
                try {
                    array[f][c] = Integer.parseInt(input); //ASIGNAR VALOR AL ARREGLO
                } catch (NumberFormatException e) {
                    mensajeAdvertencia("SE DEBEN INGRESAR SOLO NÚMEROS"); //MENSAJE DE ADVERTENCIA
                    c--; //DECREMENTAR C PARA VOLVER A SOLICITAR EL MISMO INDICE
                }
            }
        }
    }

    //CREAR LA MATRIZ TRANSPUESTA
    private static void transponerMatriz(int[][] arrayNumeros, int[][] arrayTranspuesta, int filas, int columnas) {
        for (int f = 0; f < filas; f++) { //FILAS
            for (int c = 0; c < columnas; c++) { //COLUMNAS
                arrayTranspuesta[c][f] = arrayNumeros[f][c]; //ASIGNAR VALORES A LA MATRIZ TRANSPUESTA
            }
        }
    }
    
    //MOSTRAR UN ARREGLO EN UN JOPTIONPANE
    private static void mostrarArreglo(int[][] array, String titulo, int filas, int columnas) {
        StringBuilder mensaje = new StringBuilder(); //STRINGBUILDER PARA FORMATEAR EL MENSAJE
        mensaje.append(titulo).append(":\n"); //AGREGAR TÍTULO
        for (int f = 0; f < filas; f++) { //FILAS
            for (int c = 0; c < columnas; c++) { //COLUMNAS
                mensaje.append(array[f][c]).append(" "); //AGREGAR VALORES
            }
            mensaje.append("\n"); //SALTO DE LÍNEA
        }
        //MOSTRAR EL ARREGLO EN UN JOPTIONPANE
        JOptionPane.showMessageDialog(null, mensaje.toString(), titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    //MOSTRAR MENSAJE DE ERROR
    private static void mensajeError(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        System.exit(0); //SALIR SI SE CANCELA
    }
    
    //MOSTRAR MENSAJE DE ADVERTENCIA
    private static void mensajeAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
    }
}
