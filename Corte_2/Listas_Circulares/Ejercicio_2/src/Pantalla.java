public class Pantalla {
    private Anuncio cabeza;
    private Anuncio cola;

    public Pantalla() {
        cabeza = null;
        cola = null;
    }

    public void agregarAnuncio(String titulo, int duracion, String categoria) {
        Anuncio nuevo = new Anuncio(titulo, duracion, categoria);
        if (cabeza == null) {
            cabeza = cola = nuevo;
            cola.siguiente = cabeza; // circular
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
        System.out.println("Anuncio agregado: " + nuevo);
    }

    public void reproducir(int ciclos) {
        if (cabeza == null) {
            System.out.println("No hay anuncios en la pantalla.");
            return;
        }

        int tiempoTotal = 0;
        Anuncio masRepetido = cabeza;

        for (int c = 1; c <= ciclos; c++) {
            System.out.println("\n--- Ciclo " + c + " ---");
            Anuncio temp = cabeza;
            do {
                temp.vecesRepetido++;
                tiempoTotal += temp.duracionSegundos;
                System.out.println("▶ Mostrando: " + temp.titulo + " (" + temp.categoria + ")");
                if (temp.vecesRepetido > masRepetido.vecesRepetido) {
                    masRepetido = temp;
                }
                temp = temp.siguiente;
            } while (temp != cabeza);
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Tiempo total acumulado: " + tiempoTotal + " segundos");
        System.out.println("Anuncio más repetido: " + masRepetido);
    }

    public void listarAnuncios() {
        if (cabeza == null) {
            System.out.println("No hay anuncios.");
            return;
        }
        Anuncio temp = cabeza;
        System.out.println("\n--- Lista de Anuncios ---");
        do {
            System.out.println(temp);
            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}