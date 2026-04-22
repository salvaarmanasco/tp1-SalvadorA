import java.util.Scanner;

public class Ejercicio5 {
    public static void ejecutar() {
        System.out.println("Ingrese una palabra: ");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.next();
        String alReves = "";
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            alReves = letra + alReves;
        }

        if(alReves.equals(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
        scanner.close();
    }
}
