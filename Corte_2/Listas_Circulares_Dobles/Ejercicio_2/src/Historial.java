public class Historial {
    Comando cabeza;
    Comando cola;
    Comando cursor;

    public Historial() {
        cabeza = null;
        cola = null;
        cursor = null;
    }

    public boolean estaVacio() {
        return cabeza == null;
    }

    public void agregarComando(String texto, boolean exitoso, String directorio) {
        Comando nuevo = new Comando(texto, exitoso, directorio);
        if (cabeza == null) {
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            cabeza = nuevo;
            cola = nuevo;
            cursor = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cola = nuevo;
        }
    }

    public void arriba() {
        if (!estaVacio() && cursor != null) {
            cursor = cursor.anterior;
        }
    }

    public void abajo() {
        if (!estaVacio() && cursor != null) {
            cursor = cursor.siguiente;
        }
    }

    public void mostrarCursor() {
        if (cursor != null) {
            System.out.println("Cursor en: " + cursor);
        } else {
            System.out.println("No hay comandos.");
        }
    }

    public void eliminarActual() {
        if (estaVacio() || cursor == null) return;
        if (cursor == cabeza && cursor == cola) {
            cabeza = null;
            cola = null;
            cursor = null;
            return;
        }
        cursor.anterior.siguiente = cursor.siguiente;
        cursor.siguiente.anterior = cursor.anterior;
        if (cursor == cabeza) cabeza = cursor.siguiente;
        if (cursor == cola) cola = cursor.anterior;
        cursor = cursor.siguiente;
    }

    public void mostrarHistorial() {
        if (estaVacio()) {
            System.out.println("Historial vacío.");
            return;
        }
        Comando actual = cabeza;
        do {
            if (actual == cursor) {
                System.out.println("-> " + actual);
            } else {
                System.out.println("   " + actual);
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}