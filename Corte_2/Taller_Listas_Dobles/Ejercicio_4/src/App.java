import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consultorio consultorio = new Consultorio();
        int opcion;

        do {
            System.out.println("\n--- MENÚ CONSULTORIO ---");
            System.out.println("1. Agregar Paciente");
            System.out.println("2. Listar Pacientes");
            System.out.println("3. Mostrar Paciente de Mayor Edad");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Nivel de urgencia (1-5): ");
                    int urgencia = sc.nextInt();
                    consultorio.agregarPaciente(nombre, edad, urgencia);
                    break;

                case 2:
                    consultorio.listarPacientes();
                    break;

                case 3:
                    consultorio.pacienteMayorEdad();
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