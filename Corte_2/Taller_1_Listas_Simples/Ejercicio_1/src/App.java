
public class App {
    public static void main(String[] args) {
        ListaInventario inventario = new ListaInventario();

        inventario.insertarProducto("Leche Entera", 10, 2);
        inventario.insertarProducto("Yogurt Natural", 15, 6);
        inventario.insertarProducto("Queso Fresco", 8, 1);
        inventario.insertarProducto("Kumis", 12, 4);

        inventario.mostrarInventario();

        inventario.mostrarProductosPorVencer();
    }
}
