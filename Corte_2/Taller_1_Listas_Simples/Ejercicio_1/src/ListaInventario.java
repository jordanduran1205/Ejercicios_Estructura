public class ListaInventario {
    private Producto cabeza;
    private Producto cola;

    public void insertarProducto(String nombre, int cantidad, int diasParaVencer) {
        Producto nuevo = new Producto(nombre, cantidad, diasParaVencer);

        if (diasParaVencer < 3) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            if (cola == null) {
                cola = nuevo;
            }
        } else {
            if (cabeza == null) {
                cabeza = nuevo;
                cola = nuevo;
            } else {
                cola.siguiente = nuevo;
                cola = nuevo;
            }
        }
    }

    public void mostrarInventario() {
        Producto actual = cabeza;
        System.out.println("Inventario completo:");
        while (actual != null) {
            System.out.println("Producto: " + actual.nombre +
                               " | Cantidad: " + actual.cantidad +
                               " | Días para vencer: " + actual.diasParaVencer);
            actual = actual.siguiente;
        }
    }
    public void mostrarProductosPorVencer() {
        Producto actual = cabeza;
        System.out.println("\nProductos con menos de 5 días para vencer:");
        while (actual != null) {
            if (actual.diasParaVencer < 5) {
                System.out.println("Producto: " + actual.nombre +
                                   " | Cantidad: " + actual.cantidad +
                                   " | Días para vencer: " + actual.diasParaVencer);
            }
            actual = actual.siguiente;
        }
    }
}
