public class Consultorio {
    private Paciente cabeza;
    private Paciente cola;

    public Consultorio() {
        cabeza = null;
        cola = null;
    }

    public void agregarPaciente(String nombre, int edad, int nivelUrgencia) {
        Paciente nuevo = new Paciente(nombre, edad, nivelUrgencia);

        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            if (nivelUrgencia == 5) {
                
                nuevo.siguiente = cabeza.siguiente;
                cabeza.siguiente = nuevo;
                if (nuevo.siguiente == null) cola = nuevo;
            } else {

                cola.siguiente = nuevo;
                cola = nuevo;
            }
        }
        System.out.println("Paciente agregado: " + nuevo);
    }

    public void listarPacientes() {
        Paciente temp = cabeza;
        System.out.println("\n--- Lista de Pacientes ---");
        while (temp != null) {
            System.out.println(temp);
            temp = temp.siguiente;
        }
    }

    public void pacienteMayorEdad() {
        if (cabeza == null) {
            System.out.println("No hay pacientes en la lista.");
            return;
        }

        Paciente temp = cola;
        Paciente mayor = cola;

        while (temp != null) {
            if (temp.edad > mayor.edad) {
                mayor = temp;
            }

            temp = obtenerAnterior(temp);
        }

        System.out.println("\nPaciente de mayor edad:");
        System.out.println(mayor);
    }

    private Paciente obtenerAnterior(Paciente nodo) {
        if (nodo == cabeza) return null;
        Paciente temp = cabeza;
        while (temp != null && temp.siguiente != nodo) {
            temp = temp.siguiente;
        }
        return temp;
    }
}