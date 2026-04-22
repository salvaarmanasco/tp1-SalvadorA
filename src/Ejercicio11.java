import java.util.Scanner;

public class Ejercicio11 {
    public static void ejecutar() {
        System.out.println("Ingrese un valor para calcular Fibonacci: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int resultado = calcularFibonacci(n);
        System.out.println("El valor de Fibonacci para " + n + " es: " + resultado);
        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
