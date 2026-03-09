// 1. El Podio de la Competencia
// Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)
//
// Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico
// necesita determinar quiénes ganaron las medallas.
//
// Detalle del ejercicio: El programa debe solicitar cuántos corredores
// participaron (máximo 10). Luego, debe pedir el tiempo en segundos
// (con decimales) de cada corredor.
//
// Lógica de Selección: El algoritmo debe buscar el tiempo más bajo
// (el más rápido) en cada iteración y colocarlo al inicio.
//
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado
// y mostrar quién obtuvo Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).

import java.util.Scanner;

public class PodioCompetencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Ingrese la cantidad de corredores (máximo 10): ");
            n = sc.nextInt();
        } while (n > 10 || n <= 0);

        double[] tiempos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el tiempo del corredor " + (i + 1) + " en segundos: ");
            tiempos[i] = sc.nextDouble();
        }

        for (int i = 0; i < n - 1; i++) {
            int minimo = i;

            for (int j = i + 1; j < n; j++) {
                if (tiempos[j] < tiempos[minimo]) {
                    minimo = j;
                }
            }

            double temp = tiempos[i];
            tiempos[i] = tiempos[minimo];
            tiempos[minimo] = temp;
        }

        System.out.println("\nTiempos ordenados:");
        for (int i = 0; i < n; i++) {
            System.out.println(tiempos[i] + " segundos");
        }

        if (n >= 3) {
            System.out.println("\nPodio:");
            System.out.println("Oro: " + tiempos[0] + " segundos");
            System.out.println("Plata: " + tiempos[1] + " segundos");
            System.out.println("Bronce: " + tiempos[2] + " segundos");
        }

        sc.close();
    }
}
