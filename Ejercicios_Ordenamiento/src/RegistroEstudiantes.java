// 4. Registro Alfabético de Estudiantes
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)
//
// Contexto: El profesor necesita pasar asistencia y requiere que la lista
// de nombres ingresada en el sistema se ordene alfabéticamente de la A a la Z.
//
// Detalle del ejercicio: El programa pregunta cuántos alumnos hay en clase
// y luego solicita sus nombres.
//
// Lógica de Texto: Se usa Insertion Sort adaptado para String.
//
// Requisito técnico: Se utiliza el método compareToIgnoreCase().
// Si nombre1.compareToIgnoreCase(nombre2) > 0 significa que
// nombre1 es alfabéticamente mayor que nombre2 y debe moverse.
//
// Resultado esperado: Mostrar la lista de estudiantes ordenada
// alfabéticamente.

import java.util.Scanner;

public class RegistroEstudiantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] nombres = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        for (int i = 1; i < n; i++) {

            String clave = nombres[i];
            int j = i - 1;

            while (j >= 0 && nombres[j].compareToIgnoreCase(clave) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }

            nombres[j + 1] = clave;
        }

        System.out.println("\nLista de estudiantes en orden alfabético:");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i]);
        }

        sc.close();
    }
}