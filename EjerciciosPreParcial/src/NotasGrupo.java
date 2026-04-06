import java.util.Arrays;
import java.util.Scanner;

public class NotasGrupo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] notas = new double[5];

        System.out.println("--- REGISTRO DE NOTAS ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese nota del Estudiante " + (i + 1) + ": ");
            notas[i] = leer.nextDouble();
            System.out.println("Vector actual: " + Arrays.toString(notas));
        }

        System.out.println("\nNotas ingresadas: " + Arrays.toString(notas));

        double max = notas[0], min = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];
        }

        System.out.println("\n--- INFORME ACADÉMICO ---");
        System.out.println("La nota más ALTA del grupo es: " + max);
        System.out.println("La nota más BAJA del grupo es: " + min);

        for (int i = 0; i < notas.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[j] < notas[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = notas[minIndex];
            notas[minIndex] = notas[i];
            notas[i] = temp;
        }
        System.out.println("\n--- LISTA DE NOTAS ORDENADA (Menor a Mayor) ---");
        System.out.println(Arrays.toString(notas));

        leer.close();
    }
}