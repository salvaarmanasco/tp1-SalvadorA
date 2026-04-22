import java.util.Scanner;

public class Ejercicio8 {
    public static void ejecutar() {
        System.out.println("Ingrese un valor en grados Celsius: ");
        Scanner scanner = new Scanner(System.in);
        int gradosCelsius = scanner.nextInt();

        int gradosFahrenheit = (int) (gradosCelsius * 9/5 + 32);
        System.out.println("El valor en grados Fahrenheit es: " + gradosFahrenheit);

        System.out.println("Ingrese un valor en grados Fahrenheit: ");
        int gradosFahrenheit2 = scanner.nextInt();
        int gradosCelsius2 = (int) ((gradosFahrenheit2 - 32) * 5/9);
        System.out.println("El valor en grados Celsius es: " + gradosCelsius2);
        scanner.close();
    }
}
