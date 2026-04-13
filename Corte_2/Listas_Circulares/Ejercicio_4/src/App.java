import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();
        int opcion;

        do {
            System.out.println("\n--- MENÚ RESTAURANTE ---");
            System.out.println("1. Agregar Grupo");
            System.out.println("2. Mostrar Lista de Espera");
            System.out.println("3. Atender Siguiente Grupo");
            System.out.println("4. Simular 6 Turnos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la reserva: ");
                    String nombre = sc.nextLine();
                    System.out.print("Número de personas: ");
                    int personas = sc.nextInt();
                    System.out.print("¿Es VIP? (true/false): ");
                    boolean vip = sc.nextBoolean();
                    System.out.print("Minutos esperando: ");
                    int minutos = sc.nextInt();
                    sc.nextLine();
                    restaurante.agregarGrupo(nombre, personas, vip, minutos);
                    break;

                case 2:
                    restaurante.mostrarLista();
                    break;

                case 3:
                    restaurante.atenderSiguiente();
                    break;

                case 4:
                    for (int i = 1; i <= 6; i++) {
                        System.out.println("\n=== Turno " + i + " ===");
                        restaurante.atenderSiguiente();
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}