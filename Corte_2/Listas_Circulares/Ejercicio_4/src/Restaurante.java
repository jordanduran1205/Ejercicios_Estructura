public class Restaurante {
    private Grupo cabeza;
    private Grupo cola;

    public Restaurante() {
        cabeza = null;
        cola = null;
    }

    public void agregarGrupo(String nombre, int personas, boolean vip, int minutos) {
        Grupo nuevo = new Grupo(nombre, personas, vip, minutos);
        if (cabeza == null) {
            cabeza = cola = nuevo;
            cola.siguiente = cabeza; // circular
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
        System.out.println("Grupo agregado: " + nuevo);
    }

    public void atenderSiguiente() {
        if (cabeza == null) {
            System.out.println("No hay grupos en espera.");
            return;
        }

        Grupo actual = cabeza;
        System.out.println("\n▶ Atendiendo: " + actual);

        if (actual.esVip) {
            // VIP vuelve al final
            cabeza = cabeza.siguiente;
            cola = actual;
            System.out.println("Grupo VIP atendido, vuelve al final de la lista.");
        } else {
            // Grupo normal se elimina
            if (cabeza == cola) {
                cabeza = cola = null;
            } else {
                cabeza = cabeza.siguiente;
                cola.siguiente = cabeza;
            }
            System.out.println("Grupo normal atendido y eliminado de la lista.");
        }

        mostrarLista();
    }

    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }
        Grupo temp = cabeza;
        System.out.println("\n--- Lista Actual ---");
        do {
            System.out.println(temp);
            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}