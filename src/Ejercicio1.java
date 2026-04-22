import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar(){
        System.out.println("Ingrese su nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre + "!");
        scanner.close();
    }
}