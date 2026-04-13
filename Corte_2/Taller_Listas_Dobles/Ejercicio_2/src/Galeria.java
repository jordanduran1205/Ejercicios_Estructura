public class Galeria {
    private Fotografia cabeza;
    private Fotografia cola;
    private Fotografia actual;

    public Galeria() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    public void agregarFoto(Fotografia foto) {
        if (cabeza == null) {
            cabeza = cola = actual = foto;
        } else {
            cola.siguiente = foto;
            foto.anterior = cola;
            cola = foto;
        }
    }

    public void mostrarFotoActual() {
        if (actual != null) {
            System.out.println(actual);
        } else {
            System.out.println("No hay fotos en la galería.");
        }
    }

    public void siguienteFoto() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarFotoActual();
        } else {
            System.out.println("Ya estás en la última foto.");
        }
    }

    public void anteriorFoto() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            mostrarFotoActual();
        } else {
            System.out.println("Ya estás en la primera foto.");
        }
    }

    public void reproducirGaleria() {
        System.out.println("\n▶ Recorriendo hacia adelante:");
        Fotografia temp = cabeza;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.siguiente;
        }

        System.out.println("\n◀ Recorriendo hacia atrás:");
        temp = cola;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.anterior;
        }
    }
}