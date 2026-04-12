import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Navegador navegador = new Navegador();
        int opcion;

        do {
            System.out.println("\n--- MENÚ NAVEGADOR ---");
            System.out.println("1. Abrir Pestaña");
            System.out.println("2. Mostrar Pestaña Actual");
            System.out.println("3. Ir a Pestaña Anterior");
            System.out.println("4. Ir a Pestaña Siguiente");
            System.out.println("5. Cerrar Pestaña Actual (por URL)");
            System.out.println("6. Listar Pestañas");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título de la página: ");
                    String titulo = sc.nextLine();
                    System.out.print("URL: ");
                    String url = sc.nextLine();
                    System.out.print("Hora de apertura: ");
                    String hora = sc.nextLine();
                    navegador.abrirPestana(titulo, url, hora);
                    break;

                case 2:
                    navegador.mostrarPestanaActual();
                    break;

                case 3:
                    navegador.anteriorPestana();
                    break;

                case 4:
                    navegador.siguientePestana();
                    break;

                case 5:
                    System.out.print("Ingrese la URL de la pestaña a cerrar: ");
                    String cerrarUrl = sc.nextLine();
                    navegador.cerrarPestanaActual(cerrarUrl);
                    break;

                case 6:
                    navegador.listarPestanas();
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);

        sc.close();
    }
}