//Un sistema universitario necesita registrar la información básica de un estudiante: 
// nombre completo, código (número entero), semestre actual, promedio acumulado y si está matriculado o no.
//Declara las variables con los tipos de datos apropiados.
//Asigna valores de ejemplo.
//Imprime un reporte por consola con el siguiente formato:
//```
//=== Ficha del Estudiante ===
//Nombre: Ana Torres
//Código: 20241001
//Semestre: 3
//Promedio: 3.85
//Matriculado: true
import java.util.Scanner;

public class FichaEstudiante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombreCompleto;
        int codigo;
        int semestreActual;
        double promedioAcumulado;
        boolean matriculado;

        System.out.print("Ingrese el nombre completo: ");
        nombreCompleto = sc.nextLine();

        System.out.print("Ingrese el código: ");
        codigo = sc.nextInt();

        System.out.print("Ingrese el semestre actual: ");
        semestreActual = sc.nextInt();

        System.out.print("Ingrese el promedio acumulado: ");
        promedioAcumulado = sc.nextDouble();

        System.out.print("¿Está matriculado? (true/false): ");
        matriculado = sc.nextBoolean();

        System.out.println("\n=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestreActual);
        System.out.println("Promedio: " + promedioAcumulado);
        System.out.println("Matriculado: " + matriculado);

        sc.close();
    }
}