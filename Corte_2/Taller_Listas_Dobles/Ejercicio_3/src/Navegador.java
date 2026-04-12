public class Navegador {
    private Pestana cabeza;
    private Pestana cola;
    private Pestana actual;

    public Navegador() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    public void abrirPestana(String titulo, String url, String hora) {
        Pestana nueva = new Pestana(titulo, url, hora);
        if (cabeza == null) {
            cabeza = cola = actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
            actual = nueva;
        }
        System.out.println("Pestaña abierta: " + nueva);
    }

    public void mostrarPestanaActual() {
        if (actual != null) {
            System.out.println("Actual -> " + actual);
        } else {
            System.out.println("No hay pestañas abiertas.");
        }
    }

    public void anteriorPestana() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            mostrarPestanaActual();
        } else {
            System.out.println("No hay pestaña anterior.");
        }
    }

    public void siguientePestana() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarPestanaActual();
        } else {
            System.out.println("No hay pestaña siguiente.");
        }
    }

    public void cerrarPestanaActual(String url) {
        Pestana temp = cabeza;
        while (temp != null) {
            if (temp.url.equals(url)) {
                
                if (temp == cabeza && temp == cola) {
                    cabeza = cola = actual = null;
                }

                else if (temp == cabeza) {
                    cabeza = cabeza.siguiente;
                    if (cabeza != null) cabeza.anterior = null;
                    actual = cabeza;
                }

                else if (temp == cola) {
                    cola = cola.anterior;
                    if (cola != null) cola.siguiente = null;
                    actual = cola;
                }

                else {
                    temp.anterior.siguiente = temp.siguiente;
                    temp.siguiente.anterior = temp.anterior;
                    actual = temp.anterior; 
                }
                System.out.println("Pestaña cerrada: " + url);
                return;
            }
            temp = temp.siguiente;
        }
        System.out.println("No se encontró la pestaña con URL: " + url);
    }

    public void listarPestanas() {
        Pestana temp = cabeza;
        System.out.println("\n--- Pestañas abiertas ---");
        while (temp != null) {
            System.out.println(temp);
            temp = temp.siguiente;
        }
    }
}