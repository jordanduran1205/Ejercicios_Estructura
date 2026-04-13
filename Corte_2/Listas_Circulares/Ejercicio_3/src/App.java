import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planificador planificador = new Planificador();
        int opcion;

        do {
            System.out.println("\n--- MENÚ PLANIFICADOR ROUND ROBIN ---");
            System.out.println("1. Agregar Proceso");
            System.out.println("2. Listar Procesos");
            System.out.println("3. Ejecutar Planificador");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del proceso: ");
                    String nombre = sc.nextLine();
                    System.out.print("PID: ");
                    int pid = sc.nextInt();
                    System.out.print("Tiempo restante: ");
                    int tiempo = sc.nextInt();
                    System.out.print("Prioridad (1-3): ");
                    int prioridad = sc.nextInt();
                    planificador.agregarProceso(nombre, pid, tiempo, prioridad);
                    break;

                case 2:
                    planificador.listarProcesos();
                    break;

                case 3:
                    System.out.print("Quantum: ");
                    int quantum = sc.nextInt();
                    planificador.ejecutar(quantum);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}