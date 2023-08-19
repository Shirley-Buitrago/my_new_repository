import java.util.Scanner;
public class TrabajoenclasesB4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    System.out.print("Ingresa el primer número: ");
                    String num1Str = scanner.nextLine();
                    if (num1Str.isEmpty()) {
                        System.out.println("No has ingresado un número. Intenta de nuevo.");
                        continue;
                    }
                    double num1 = Double.parseDouble(num1Str);

                    System.out.print("Ingresa el segundo número: ");
                    String num2Str = scanner.nextLine();
                    if (num2Str.isEmpty()) {
                        System.out.println("No has ingresado un número. Intenta de nuevo.");
                        continue;
                    }
                    double num2 = Double.parseDouble(num2Str);

                    double result = num1 / num2;

                    if (Double.isInfinite(result) || Double.isNaN(result)) {
                        System.out.println("La división tiene una indeterminación.");
                    } else {
                        System.out.println("El resultado de la división es: " + result);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: No has ingresado un número válido.");
                } catch (ArithmeticException e) {
                    System.out.println("Error: División entre cero.");
                }

                System.out.print("¿Deseas realizar otra división? (S/N): ");
                String continuar = scanner.nextLine();
                if (!continuar.equalsIgnoreCase("S")) {
                    System.out.println("¡Hasta luego!");
                    break;
                }
            }

            scanner.close();
        }
    }
