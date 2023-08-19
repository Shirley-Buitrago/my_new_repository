import java.util.Scanner;

public class MenuLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        final int MAX_INTENTOS = 3;
        boolean usuarioBloqueado = false;
        
        while (intentos < MAX_INTENTOS) {
            if (usuarioBloqueado) {
                System.out.println("Usuario bloqueado. Contacte al administrador.");
                break;
            }
            
            System.out.println("Menú:");
            System.out.println("1. Realizar login");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    boolean loginExitoso = realizarLogin();
                    if (!loginExitoso) {
                        intentos++;
                        if (intentos == MAX_INTENTOS) {
                            usuarioBloqueado = true;
                        } else {
                            System.out.println("Login fallido. Inténtelo de nuevo.");
                        }
                    } else {
                        System.out.println("Login exitoso. ¡Bienvenido!");
                        intentos = 0; // Reiniciar intentos después de un login exitoso
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }
    
    public static boolean realizarLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();
        
        // Aquí deberías tener una lógica para verificar el usuario y contraseña
        // Con fines de ejemplo, supongamos que el usuario es "usuario" y la contraseña es "contraseña"
        return usuario.equals("usuario") && contrasena.equals("contraseña");
    }
}
