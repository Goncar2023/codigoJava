/*    
    IMPORTANTE
    Para ejecutar el ejemplo:
    -> Crea un nuevo proyecto en NetBeans
    -> Copia el código que se encuentra dentro del método MAIN de este archivo y
       pegalo dentro del método MAIN de tu proyecto.
*/
public static void main(String[] args) {
    //ARREGLOS BIDIMENSIONALES
    
    //DECLARACION
    String[][] informacion;
    //CREANDO UNA MATRIZ
    informacion = new String[2][2];
    
    //DECLARAR Y CREAR
    //int[][] numeros = new int[FILAS][COLUMNAS];
    int[][] notas = new int[3][3];
    //INGRESAR DATOS A UNA MATRIZ
    informacion[0][0] = "ELIANA";
    informacion[0][1] = "GONZALEZ";
    
    informacion[1][0] = "FRANCO";
    informacion[1][1] = "ALFARO";
    
    //MOSTRAR INFORMACION
    System.out.println("NOMBRE COMPLETO:"
    +informacion[0][0]+" "+informacion[0][1]);
    
    //DECLARAR, CREAR E INICIALIZAR
    String[][] nombresCompletos = {
        {"ELIANA","GONZALEZ"},
        {"FRANCO","ALFARO"},
        {"ALEJANDRO","TORRES"},
        {"JAVIERA", "DIAZ"}
    };
    
    double[][] promedios = {
        {6.8, 7.0, 3.0},
        {2.0, 6.5, 7.0},
        {4.5, 7.0, 1.0}
    };
    
    //PARA FORMATERA NUMERO DECIMALES
    DecimalFormat df = new DecimalFormat("#.0"); //UN DECIMAL DESPUES DE LA COMA
    
    //FOR ANIDADO PARA LEER LAS MATRICES
    for(int filas= 0; promedios.length < 3; filas++){
        double promGeneral = 0.0;
        for(int columnas = 0; promedios[filas].length < 3; columnas++){
            promGeneral += promedios[filas][columnas];
        }
        System.out.println("PROMEDIO "+(df.format(promGeneral/3)));
    }

}