import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar() {
        System.out.println("Ingrese una palabra: ");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.next();
        int contador = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        System.out.println("La palabra contiene " + contador + " vocales.");
        scanner.close();
    }
}
