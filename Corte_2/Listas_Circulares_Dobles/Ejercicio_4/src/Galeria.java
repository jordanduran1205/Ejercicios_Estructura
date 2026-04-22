public class Galeria {
    Foto cabeza;
    Foto cola;
    Foto actual;

    public Galeria() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarFoto(String titulo, String fecha, boolean esFavorita) {
        Foto nueva = new Foto(titulo, fecha, esFavorita);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            cola = nueva;
            actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void siguiente() {
        if (!estaVacia() && actual != null) {
            actual = actual.siguiente;
        }
    }

    public void anterior() {
        if (!estaVacia() && actual != null) {
            actual = actual.anterior;
        }
    }

    public void toggleFavorita() {
        if (actual != null) {
            actual.esFavorita = !actual.esFavorita;
        }
    }

    public void eliminarActual() {
        if (estaVacia() || actual == null) return;
        if (actual == cabeza && actual == cola) {
            cabeza = null;
            cola = null;
            actual = null;
            return;
        }
        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;
        if (actual == cabeza) cabeza = actual.siguiente;
        if (actual == cola) cola = actual.anterior;
        actual = actual.siguiente;
    }

    public void mostrarGaleria() {
        if (estaVacia()) {
            System.out.println("No hay fotos en la galería.");
            return;
        }
        Foto temp = cabeza;
        do {
            String marca = (temp == actual) ? "[▶]" : "   ";
            System.out.println(marca + " " + temp.toString());
            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}