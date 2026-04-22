import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar(){
        System.out.println("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        scanner.close();
    }
}
