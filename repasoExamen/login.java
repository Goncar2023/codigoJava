public static void main(String[] args) {
    //ARREGLOS UNIDIMENSONALES PARA ALMACENAR LAS CREDENCIALES DE ACCESO
    String[] usuarios = {"admin", "root", "superUser"};
    String[] password = {"12345", "54321", "11111"};
    
    //OBJETO SCANNER
    Scanner scanner = new Scanner(System.in);
    boolean acceso = false;

    System.out.println("=== INICIO DE SESION ===");
    
    //BUCLE PARA CONTROLAR LOS 3 INTENTOS
    for (int intentos = 1; intentos <= 3; intentos++) {
        System.out.print("Ingrese su nombre de usuario: ");
        String user = scanner.nextLine();
        System.out.print("Ingrese su password: ");
        String pass = scanner.nextLine();

        //VERIFICAR EL NOMBRE DE USUARIO Y LA CONTRASEÑA
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(user) && password[i].equals(pass)) {
                acceso = true;
                break;
            }
        }

        if(acceso){
            System.out.println("ACCESO CONCEDIDO. ¡BIENVENIDO, "+user+"!");
            break;
        }else{
            System.out.println("USUARIO O PASSWORD INCORRECTAS. INTENTO" + intentos + " DE 3.");
        }
    }

    if (!acceso) {
        System.out.println("HA SUPERADO EL MAXIMO DE INTENTOS. ¡CUENTA BLOQUEADA!");
    }
}