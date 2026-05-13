import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Callejon callejon = new Callejon();
        int opcion;

        do {
            System.out.println("\n=== MENU CALLEJON DE CAMIONES ===");
            System.out.println("1. Ingresar camión");
            System.out.println("2. Retirar camión");
            System.out.println("3. Mostrar camiones en el callejón");
            System.out.println("4. Calcular carga total");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Ingrese nombre del conductor: ");
                    String conductor = sc.nextLine();
                    System.out.print("Ingrese carga en toneladas: ");
                    double carga = sc.nextDouble();
                    sc.nextLine();
                    callejon.entrarCamion(placa, conductor, carga);
                    break;

                case 2:
                    callejon.salirCamion();
                    break;

                case 3:
                    callejon.mostrarCallejon();
                    break;

                case 4:
                    double total = callejon.calcularCargaTotal();
                    System.out.println("La carga total en el callejón es: " + total + " toneladas.");
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