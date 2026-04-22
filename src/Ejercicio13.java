import java.util.Scanner;

public class Ejercicio13 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[3];
        double[][] notas = new double[3][3];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.next();

            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la nota de la materia " + (j + 1) + " para " + nombres[i] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / 3;
            System.out.println("Estudiante: " + nombres[i] + " | Promedio: " + promedio);
        }

        scanner.close();
    }
}