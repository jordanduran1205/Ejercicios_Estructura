public class Reproductor {
    private Cancion cabeza;
    private Cancion cola;
    private Cancion actual;

    public Reproductor() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    public void agregarCancion(String titulo, String artista, int duracion) {
        Cancion nueva = new Cancion(titulo, artista, duracion);
        if (cabeza == null) {
            cabeza = cola = actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
        System.out.println("Canción agregada: " + nueva);
    }

    public void mostrarCancionActual() {
        if (actual != null) {
            System.out.println("▶ Reproduciendo: " + actual);
        } else {
            System.out.println("No hay canciones en la lista.");
        }
    }

    public void saltarAdelante() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarCancionActual();
        } else {
            System.out.println("No hay más canciones adelante.");
        }
    }

    public void saltarAtras() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            mostrarCancionActual();
        } else {
            System.out.println("Ya estás en la primera canción, no puedes retroceder.");
        }
    }

    public void listarCanciones() {
        Cancion temp = cabeza;
        System.out.println("\n--- Lista de Canciones ---");
        while (temp != null) {
            System.out.println(temp);
            temp = temp.siguiente;
        }
    }
}