public static void main(String[] args) {
    //DECLARAR ARREGLOS PARA ALMACENAR NOTAS Y ESTUDIANTES
    String[] estudiantes = new String[3];
    double[][] notas = new double[3][3]; //3 ESTUDIANTES - 3 NOTAS POR ESTUDIANTE
    
    Scanner scanner = new Scanner(System.in);

    //INGRESAR NOMBRES Y NOTAS
    System.out.println("------ REGISTRO DE CALIFICACIONES ------");
    for (int x = 0; x < estudiantes.length; x++) {
        System.out.print("Nombre del estudiante " + (x + 1) + ": ");
        estudiantes[x] = scanner.nextLine();

        System.out.println("Ingrese las notas de " + estudiantes[x] + ":");
        for (int nota = 0; nota < notas[x].length; nota++) {
            System.out.print("Nota " + (nota + 1) + ": ");
            notas[x][nota] = scanner.nextDouble();
        }
        scanner.nextLine();
    }

    //CALCULAR Y MOSTRAR EL PROMEDIO DE CADA ESTUDIANTE
    System.out.println("\n------ PROMEDIOS ------");
    for (int x = 0; x < estudiantes.length; x++) {
        double suma = 0;
        for (int nota = 0; nota < notas[x].length; nota++) {
            suma += notas[x][nota];
        }
        double promedio = suma / notas[x].length;
        System.out.printf("Promedio de %s: %.1f%n", estudiantes[x], promedio);
    }
}