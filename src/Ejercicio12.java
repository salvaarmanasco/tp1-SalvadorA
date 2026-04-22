import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // 1. Pedir los números usando un bucle (más eficiente)
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " de 5: ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        int[] ordenadoMayorAMenor = new int[5];
        for (int i = 0; i < 5; i++) {
            ordenadoMayorAMenor[i] = numeros[4 - i];
        }

        System.out.println("Arreglo original (ordenado de menor a mayor): " + Arrays.toString(numeros));
        System.out.println("Arreglo de mayor a menor: " + Arrays.toString(ordenadoMayorAMenor));
        
        scanner.close();
    }
}