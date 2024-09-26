public static void main(String[] args) {
        
        /*
            EL OPERADOR TERNARIO ? 
            ES UNA FORMA COMPACTA DE ESCRIBIR UNA EXPRESION CONDICIONAL,
            SIMILAR A UN IF - ELSE. 
        
            ESTRUCTURA
            CONDICION ? EXPRESION SI ES VERDAERO : EXPRESION SI ES FALSO; 
            
            EVALUA UNA CONDICION, SI LA CONDICION ES VERDADERA, SE EJECUTA LA PRIMERA EXPRESION,
            Y SI LA CONDICION ES FALSA, SE EJECUTA LA SEGUNDA EXPRESION (DESPUES DE :)
        */
        
        int edad = 20;
        
        //USAMOS EL OPERADOR TERNARIO PARA VERIFICAR SI ES MAYOR DE EDAD
        //                  (CONDICION) ?      TRUE          :      FALSE   
        String resultado = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        
        System.out.println("EL RESULTADO ES: "+resultado);
        
        int numero = 7;
         //VERIFICAR SI EL NUMERO ES PAR O IMPAR
        String esPar = (numero % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(esPar);
        
        int numUno = 10;
        int numDos = 20;
        
        //MAYOR DE DOS NUMEROS
        int mayor = (numUno > numDos) ? numUno : numDos;
        System.out.println("EL NUMERO MAYOR ES: " + mayor);
        
        String texto = "";
        
        //VERIFICAR SI LA CADENA ESTA VACIA
        String cadena = (texto.isEmpty()) ? "La cadena está vacía" : "La cadena no está vacía";
        System.out.println(cadena);
        
        int num = -10;
        
        // Usamos el operador ternario para clasificar el número
        String result = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Cero";
        /*
            PRIMERO SE EVALUA SI EL NUMERO ES MAYOR A 0 (num > 0 )
            SI ES TRUE, EL RESULTADO ES "POSITIVO"
            SI ES FALSE, SE EVALUA OTRA CONDICION (NUMERO < 0)
            SI ESTA SEGUNDA CONDICION ES TRUE, EL RESULTADO ES "NEGATIVO", Y SI NO LO ES, EL RESULTADO SERA "CERO".
        */
        System.out.println("EL NUMERO ES: " + result);
        
    }