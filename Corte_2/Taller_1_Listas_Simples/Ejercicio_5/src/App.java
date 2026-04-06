import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaReproduccion lista = new ListaReproduccion();

        System.out.print("¿Cuántas canciones desea ingresar inicialmente? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nIngrese datos de la canción " + (i+1) + ":");
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Artista: ");
            String artista = sc.nextLine();

            System.out.print("Duración en segundos: ");
            int duracion = sc.nextInt();
            sc.nextLine();

            System.out.print("Género: ");
            String genero = sc.nextLine();

            lista.agregarAlFinal(titulo, artista, duracion, genero);
        }

        lista.mostrarLista();

        System.out.println("\nIngrese una canción para agregar a continuación de la actual:");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Artista: ");
        String artista = sc.nextLine();
        System.out.print("Duración en segundos: ");
        int duracion = sc.nextInt();
        sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();

        lista.agregarAContinuacion(titulo, artista, duracion, genero);

        lista.mostrarLista();

        lista.mostrarDuracionTotal();

        sc.close();
    }
}