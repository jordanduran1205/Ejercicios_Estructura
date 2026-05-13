public class Callejon {
    private Camion cima;

    public Callejon() {
        cima = null;
    }

    public void entrarCamion(String placa, String conductor, double cargaToneladas) {
        Camion nuevo = new Camion(placa, conductor, cargaToneladas);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("Camión ingresó al callejón.");
    }

    public void salirCamion() {
        if (cima == null) {
            System.out.println("No hay camiones en el callejón.");
        } else {
            System.out.println("Camión salió: " + cima);
            cima = cima.siguiente;
        }
    }

    public void mostrarCallejon() {
        if (cima == null) {
            System.out.println("El callejón está vacío.");
            return;
        }
        Camion aux = cima;
        System.out.println("=== Camiones en el Callejón ===");
        while (aux != null) {
            System.out.println(aux);
            aux = aux.siguiente;
        }
    }

    public double calcularCargaTotal() {
        double total = 0;
        Camion aux = cima;
        while (aux != null) {
            total += aux.cargaToneladas;
            aux = aux.siguiente;
        }
        return total;
    }
}