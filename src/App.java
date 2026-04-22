
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Seleccione el ejercicio a ejecutar (1 - 14):");
        Scanner scanner = new Scanner(System.in);
        int ejercicio = scanner.nextInt();

        switch (ejercicio) {
            case 1:
                Ejercicio1.ejecutar();
            case 2:
                Ejercicio2.ejecutar();
            case 3:
                Ejercicio3.ejecutar();
            case 4:
                Ejercicio4.ejecutar();
            // case 5:
            //     Ejercicio5.ejecutar();
            // case 6:
            //     Ejercicio6.ejecutar();
            // case 7:
            //     Ejercicio7.ejecutar();
            // case 8:
            //     Ejercicio8.ejecutar();
            // case 9:
            //     Ejercicio9.ejecutar();
            // case 10:
            //     Ejercicio10.ejecutar();
            // case 11:
            //     Ejercicio11.ejecutar();
            // case 12:
            //     Ejercicio12.ejecutar();
            // case 13:
            //     Ejercicio13.ejecutar();
            // case 14:
            //     Ejercicio14.ejecutar();
                break;
            default:
                System.out.println("Ejercicio no válido. Por favor, seleccione un número entre 1 y 14.");
        }

        scanner.close();
    }
}