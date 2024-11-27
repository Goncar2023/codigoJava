public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    boolean jugar = true;
    while (jugar) {
        mostrarMenu();
        int optUser = eleccionUsuario(scanner);
        int optOrdenador = generaRandom(random);
        
        //MOSTRAR ELECCIONES
        System.out.println("Tu elegiste: " + convertirEleccion(optUser));
        System.out.println("El ordenador eligio: " + convertirEleccion(optOrdenador));
        
        int resultado = verificarOpciones(optUser, optOrdenador);

        mostrarResultado(resultado);

        jugar = otroIntento(scanner);
    }

    System.out.println("¡JUEGO FINALIZADO!");
}

public static void mostrarMenu() {
    System.out.println("\n*** PIEDRA, PAPEL O TIJERA ***");
    System.out.println("1. PIEDRA");
    System.out.println("2. PAPEL");
    System.out.println("3. TIJERA");
    System.out.print("ELIGE UNA OPCION: ");
}

//OBTENER Y VALIDAR LA OPCION DEL USUARIO
public static int eleccionUsuario(Scanner scanner) {
    int eleccion;
    do {
        eleccion = scanner.nextInt();
        if (eleccion < 1 || eleccion > 3) {
            System.out.print("OPCION NO VALIDA. SELECCIONA NUEVAMENTE (1-3): ");
        }
    } while (eleccion < 1 || eleccion > 3);
    return eleccion;
}

//GENERARAR ELECCION DEL ORDENADOR
public static int generaRandom(Random random) {
    return random.nextInt(3) + 1;
}

public static int verificarOpciones(int usuario, int computadora) {
    if (usuario == computadora) {
        return 0; //EMPATE
    } else if ((usuario == 1 && computadora == 3) || //PIEDRA GANA A TIJERA
                (usuario == 2 && computadora == 1) || //PAPEL GANA A PIEDRA
                (usuario == 3 && computadora == 2)) { //TIJERA GANA A PAPEL
        return 1; //GANA EL USUARIO
    } else {
        return -1; //GANA EL ORDENADOR
    }
}

//CONVERTIR ELECCION A TEXTO
public static String convertirEleccion(int eleccion) {
    switch (eleccion) {
        case 1: return "PIEDRA";
        case 2: return "PAPEL";
        case 3: return "TIJERA";
        default: return "";
    }
}

//MOSTRAR RESULTADO
public static void mostrarResultado(int resultado) {
    switch (resultado) {
        case 0:
            System.out.println("¡EMPATE!");
            break;
        case 1:
            System.out.println("¡GANASTE!");
            break;
        case -1:
            System.out.println("EL ORDENADOR GANA");
            break;
    }
}

//PREGUNTA AL USUARIO SI QUIERE VOLVER A JUGAR
public static boolean otroIntento(Scanner scanner) {
    System.out.print("¿QUIERES VOLVER A JUGAR? (S/N): ");
    char respuesta = scanner.next().toLowerCase().charAt(0);
    return respuesta == 's';
}