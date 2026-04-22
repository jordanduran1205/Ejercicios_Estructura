public class EditorCapas {
    Capa cabeza;
    Capa cola;
    Capa capaActiva;

    public EditorCapas() {
        cabeza = null;
        cola = null;
        capaActiva = null;
    }

    public boolean estaVacio() {
        return cabeza == null;
    }

    public void agregarCapa(String nombre, boolean visible, String tipo) {
        Capa nueva = new Capa(nombre, visible, tipo);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            cola = nueva;
            capaActiva = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void subirCapa() {
        if (!estaVacio() && capaActiva != null) {
            capaActiva = capaActiva.siguiente;
        }
    }

    public void bajarCapa() {
        if (!estaVacio() && capaActiva != null) {
            capaActiva = capaActiva.anterior;
        }
    }

    public void toggleVisibilidad() {
        if (capaActiva != null) {
            capaActiva.visible = !capaActiva.visible;
        }
    }

    public void eliminarActiva() {
        if (estaVacio() || capaActiva == null) return;
        if (capaActiva == cabeza && capaActiva == cola) {
            cabeza = null;
            cola = null;
            capaActiva = null;
            return;
        }
        capaActiva.anterior.siguiente = capaActiva.siguiente;
        capaActiva.siguiente.anterior = capaActiva.anterior;
        if (capaActiva == cabeza) cabeza = capaActiva.siguiente;
        if (capaActiva == cola) cola = capaActiva.anterior;
        capaActiva = capaActiva.siguiente;
    }

    public void mostrarCapas() {
        if (estaVacio()) {
            System.out.println("No hay capas.");
            return;
        }
        Capa actual = cabeza;
        do {
            String marca = (actual == capaActiva) ? "[✓]" : "   ";
            System.out.println(marca + " " + actual.toString());
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}