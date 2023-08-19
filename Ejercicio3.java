import java.util.Scanner;

public class NumerosParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numeroLimite = scanner.nextInt();
        
        System.out.println("Números pares:");
        for (int i = 2; i <= numeroLimite; i += 2) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nNúmeros impares:");
        for (int i = 1; i <= numeroLimite; i += 2) {
            System.out.print(i + " ");
        }
    }
}
