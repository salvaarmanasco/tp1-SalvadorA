import java.util.Scanner;

public class Ejercicio9 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase para contar sus palabras:");
        String frase = scanner.nextLine();

        int total = contarPalabras(frase);

        System.out.println("El número total de palabras es: " + total);
        scanner.close();

    }

    public static int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        String[] palabras = texto.trim().split("[\\s,.]+");

        return palabras.length;
    }

}