import java.util.Scanner;

public class Ejercicio7 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        int numero;
        int valorParaOperacion;

        System.out.println("Ingrese un número: ");
        numero = scanner.nextInt();

        // Usamos !opcion.equals para comparar el contenido del texto
        while (!opcion.equals("salir")) {
            System.out.print("Elija una operación (sumar, restar, multiplicar, dividir) o escriba 'salir': ");
            opcion = scanner.next().toLowerCase(); // toLowerCase para que acepte "SALIR" o "salir"

            if (opcion.equals("salir")) {
                // No hacemos nada, el while se encargará de romper el ciclo
                continue; 
            }

            if (opcion.equals("sumar")) {
                System.out.println("Ingrese un número para sumar: ");
                valorParaOperacion = scanner.nextInt();
                System.out.println("La suma es: " + (numero + valorParaOperacion));
            } else if (opcion.equals("restar")) {
                System.out.println("Ingrese un número para restar: ");
                valorParaOperacion = scanner.nextInt();
                System.out.println("La resta es: " + (numero - valorParaOperacion));
            } else if (opcion.equals("multiplicar")) {
                System.out.println("Ingrese un número para multiplicar: ");
                valorParaOperacion = scanner.nextInt();
                System.out.println("La multiplicación es: " + (numero * valorParaOperacion));
            } else if (opcion.equals("dividir")) {
                System.out.println("Ingrese un número para dividir: ");
                valorParaOperacion = scanner.nextInt();
                if (valorParaOperacion != 0) {
                    System.out.println("La división es: " + (numero / valorParaOperacion));
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
            } else {
                // Ahora este mensaje solo sale si no es ninguna operación NI es "salir"
                System.out.println("Operación no válida.");
            }
        }

        System.out.println("¡Gracias por usar la calculadora!");
        scanner.close();
    }
}