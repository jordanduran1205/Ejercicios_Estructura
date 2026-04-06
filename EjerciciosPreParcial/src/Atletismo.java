import java.util.Scanner;

public class Atletismo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] puntajes = new int[6];

        System.out.println("--- INGRESO DE PUNTAJES ---");
        for (int i = 0; i < puntajes.length; i++) {
            System.out.print("Puntaje del Intento " + (i + 1) + ": ");
            puntajes[i] = sc.nextInt();
            for (int k = 1; k <= i; k++) {
                int clave = puntajes[k];
                int j = k - 1;
                while (j >= 0 && puntajes[j] < clave) {
                    puntajes[j + 1] = puntajes[j];
                    j--;
                }
                puntajes[j + 1] = clave;
            }

            System.out.println("\n--- TABLA PARCIAL ORDENADA (De mayor a menor) ---");
            for (int t = 0; t <= i; t++) {
                System.out.println((t + 1) + "° Lugar: " + puntajes[t]);
            }
        }

        for (int i = 1; i < puntajes.length; i++) {
            int clave = puntajes[i];
            int j = i - 1;
            while (j >= 0 && puntajes[j] < clave) {
                puntajes[j + 1] = puntajes[j];
                j--;
            }
            puntajes[j + 1] = clave;
        }
        

        System.out.println("\n--- TABLA DE RESULTADOS (De mayor a menor) ---");
        double suma = 0;
        for (int i = 0; i < puntajes.length; i++) {
            System.out.println((i + 1) + "° Lugar: " + puntajes[i]);
            suma += puntajes[i];
        }

        double promedio = suma / puntajes.length;
        System.out.println("El promedio total de los puntajes fue: " + promedio);

        System.out.println("\n--- BÚSQUEDA LINEAL ---");
        System.out.print("Ingrese puntaje a buscar: ");
        int buscado = sc.nextInt();
        int lugar = -1;

        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i] == buscado) {
                lugar = i + 1; 
                break;
            }
        }

        if (lugar != -1) {
            System.out.println(">> El puntaje " + buscado + " se encuentra en el " + lugar + "° lugar de la tabla.");
        } else {
            System.out.println(">> El puntaje " + buscado + " no se encuentra en la tabla.");
        }

        sc.close();
    }
}