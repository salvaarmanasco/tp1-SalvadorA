import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar() {
        System.out.println("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " multiplicado por " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
