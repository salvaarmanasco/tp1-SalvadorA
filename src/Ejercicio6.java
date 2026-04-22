import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar() {
        System.out.println("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
       int aleatorio = (int) (Math.random() * 100) + 1;
        
       while (numero != aleatorio) {
        
        if (numero < aleatorio) {
                System.out.println("El número a adivinar es mayor. Intente de nuevo: ");
            } else {
                System.out.println("El número a adivinar es menor. Intente de nuevo: ");
            }
            numero = scanner.nextInt();
        }
        System.out.println("¡Felicidades! Has adivinado el número.");
        scanner.close();
    }
}
