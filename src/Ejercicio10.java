import java.util.Scanner;

public class Ejercicio10 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la contraseña a evaluar: ");
        String password = scanner.nextLine();

        if (esSegura(password)) {
            System.out.println("Clave segura");
        } else {
            System.out.println("Clave insegura");
        }
        scanner.close();
    }

    public static boolean esSegura(String pass) {
        if (pass.length() < 8) {
            return false;
        }

        int contadorMayus = 0;
        int contadorMinus = 0;
        int contadorDigitos = 0;

        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);

            if (Character.isUpperCase(c)) {
                contadorMayus++;
            } else if (Character.isLowerCase(c)) {
                contadorMinus++;
            } else if (Character.isDigit(c)) {
                contadorDigitos++;
            }
        }

        boolean tieneMayus = contadorMayus >= 2;
        boolean tieneMinus = contadorMinus >= 3;
        boolean tieneDigitos = contadorDigitos >= 2;

        return tieneMayus && tieneMinus && tieneDigitos;
    }
}