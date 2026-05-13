public class Dispensador {
    private Medicamento cima; 

    public Dispensador() {
        cima = null;
    }

    public void apilarMedicamento(String nombre, String lote, int dias) {
        Medicamento nuevo = new Medicamento(nombre, lote, dias);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("Medicamento ingresado al dispensador.");
    }

    public void retirarMedicamento() {
        if (cima == null) {
            System.out.println("No hay medicamentos en el dispensador.");
        } else {
            System.out.println("Medicamento retirado: " + cima);
            cima = cima.siguiente;
        }
    }

    public void mostrarDispensador() {
        if (cima == null) {
            System.out.println("El dispensador está vacío.");
            return;
        }
        Medicamento aux = cima;
        System.out.println("=== Medicamentos en el dispensador ===");
        while (aux != null) {
            System.out.println(aux);
            aux = aux.siguiente;
        }
    }

    public void validarDespacho() {
        if (cima == null) {
            System.out.println("El dispensador está vacío.");
            return;
        }

        while (cima != null && cima.diasParaVencer < 10) {
            System.out.println("Medicamento retirado por seguridad: " + cima.nombre + 
            " (vence en " + cima.diasParaVencer + " días)");
            cima = cima.siguiente;
        }

        if (cima == null) {
            System.out.println("No quedan medicamentos aptos para despacho.");
        } else {
            System.out.println("Medicamento seguro en el tope: " + cima.nombre + 
            " (vence en " + cima.diasParaVencer + " días)");
        }
    }
}