public class ListaReproduccion {
    private Cancion cabeza;
    private Cancion cola;
    private Cancion actual; 

    public void agregarAlFinal(String titulo, String artista, int duracionSegundos, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracionSegundos, genero);
        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
            actual = cabeza;
        } else {
            cola.siguiente = nueva;
            cola = nueva;
        }
    }

    public void agregarAContinuacion(String titulo, String artista, int duracionSegundos, String genero) {
        if (actual == null) {
            agregarAlFinal(titulo, artista, duracionSegundos, genero);
            return;
        }
        Cancion nueva = new Cancion(titulo, artista, duracionSegundos, genero);
        nueva.siguiente = actual.siguiente;
        actual.siguiente = nueva;
        if (actual == cola) {
            cola = nueva;
        }
    }

    public void mostrarLista() {
        Cancion temp = cabeza;
        System.out.println("\nLista de reproducción:");
        while (temp != null) {
            System.out.println("Título: " + temp.titulo +
                               " | Artista: " + temp.artista +
                               " | Duración: " + temp.duracionSegundos + " seg" +
                               " | Género: " + temp.genero);
            temp = temp.siguiente;
        }
    }

    public void mostrarDuracionTotal() {
        int totalSegundos = 0;
        Cancion temp = cabeza;
        while (temp != null) {
            totalSegundos += temp.duracionSegundos;
            temp = temp.siguiente;
        }
        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;
        System.out.println("\nDuración total de la lista: " + minutos + " min " + segundos + " seg");
    }
}