import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dispensador dispensador = new Dispensador();
        int opcion;

        do {
            System.out.println("\n=== MENU FARMACIA AUTOMATIZADA ===");
            System.out.println("1. Ingresar medicamento");
            System.out.println("2. Retirar medicamento");
            System.out.println("3. Mostrar dispensador");
            System.out.println("4. Validar despacho");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del medicamento: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese lote: ");
                    String lote = sc.nextLine();
                    System.out.print("Ingrese días para vencer: ");
                    int dias = sc.nextInt();
                    sc.nextLine();
                    dispensador.apilarMedicamento(nombre, lote, dias);
                    break;

                case 2:
                    dispensador.retirarMedicamento();
                    break;

                case 3:
                    dispensador.mostrarDispensador();
                    break;

                case 4:
                    dispensador.validarDespacho();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}