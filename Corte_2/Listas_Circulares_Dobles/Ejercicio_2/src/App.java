// Clase Main.java (menú y simulación)
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Historial historial = new Historial();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú Historial de Comandos ===");
            System.out.println("1. Agregar comando");
            System.out.println("2. Arriba");
            System.out.println("3. Abajo");
            System.out.println("4. Mostrar cursor");
            System.out.println("5. Eliminar actual");
            System.out.println("6. Mostrar historial");
            System.out.println("7. Simulación del reto");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Texto: ");
                    String texto = sc.nextLine();
                    System.out.print("Exitoso (true/false): ");
                    boolean exito = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Directorio: ");
                    String dir = sc.nextLine();
                    historial.agregarComando(texto, exito, dir);
                    break;
                case 2:
                    historial.arriba();
                    break;
                case 3:
                    historial.abajo();
                    break;
                case 4:
                    historial.mostrarCursor();
                    break;
                case 5:
                    historial.eliminarActual();
                    break;
                case 6:
                    historial.mostrarHistorial();
                    break;
                case 7:
                    historial.agregarComando("ls", true, "/home");
                    historial.agregarComando("cd /etc", true, "/home");
                    historial.agregarComando("cat shadow", false, "/etc");
                    historial.agregarComando("pwd", true, "/etc");
                    historial.agregarComando("exit", true, "/etc");
                    historial.arriba();
                    historial.arriba();
                    historial.arriba();
                    historial.eliminarActual();
                    historial.abajo();
                    historial.mostrarHistorial();
                    break;
            }
        } while (opcion != 0);
    }
}