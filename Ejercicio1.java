import java.util.Scanner;

public class CalculadoraMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        double menor = calcularMenor(numero1, numero2);
        
        System.out.println("El menor de los dos números es: " + menor);
    }
    
    public static double calcularMenor(double num1, double num2) {
        return Math.min(num1, num2);
    }
}
