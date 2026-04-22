
public class Ejercicio14 {
    public static void ejecutar() {
        int[][] matrizInicial = {
            {1, 2, 0, 3, 0, 7},
            {0, 0, 0, 0},
            {0, 6, 9, 8, 0, 9, 6},
            {0, 0, 0, 0, 7, 9, 0, 0},
            {0, 0, 0, 0, 0},
            {8, 7, 0, 8, 9, 0, 8}
        };

        mostrar(matrizInicial);

        int[][] matrizResultado = limpiarMatriz(matrizInicial);

        System.out.println("\n--- Arreglo Resultante ---");
        mostrar(matrizResultado);
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }

    public static int[][] limpiarMatriz(int[][] original) {
        int filasValidas = 0;
        for (int[] fila : original) {
            for (int num : fila) {
                if (num != 0) {
                    filasValidas++;
                    break; 
                }
            }
        }

        int[][] resultado = new int[filasValidas][];
        int indiceFilaNueva = 0;

        for (int i = 0; i < original.length; i++) {
            int elementosNoCero = 0;
            for (int num : original[i]) {
                if (num != 0) elementosNoCero++;
            }

            if (elementosNoCero > 0) {
                resultado[indiceFilaNueva] = new int[elementosNoCero];
                int indiceColumnaNueva = 0;
                
                for (int num : original[i]) {
                    if (num != 0) {
                        resultado[indiceFilaNueva][indiceColumnaNueva] = num;
                        indiceColumnaNueva++;
                    }
                }
                indiceFilaNueva++;
            }
        }
        return resultado;
    }
}