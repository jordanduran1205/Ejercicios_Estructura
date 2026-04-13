import java.util.ArrayList;

public class Galeria {
    private ArrayList<Fotografia> fotos;
    private int indiceActual;

    public Galeria() {
        fotos = new ArrayList<>();
        indiceActual = -1; 
    }

    public void agregarFoto(Fotografia foto) {
        fotos.add(foto);
        if (indiceActual == -1) indiceActual = 0;
    }

    public void mostrarFotoActual() {
        if (indiceActual >= 0 && indiceActual < fotos.size()) {
            System.out.println(fotos.get(indiceActual));
        } else {
            System.out.println("No hay fotos en la galería.");
        }
    }

    public void siguienteFoto() {
        if (indiceActual < fotos.size() - 1) {
            indiceActual++;
            mostrarFotoActual();
        } else {
            System.out.println("Ya estás en la última foto.");
        }
    }

    public void anteriorFoto() {
        if (indiceActual > 0) {
            indiceActual--;
            mostrarFotoActual();
        } else {
            System.out.println("Ya estás en la primera foto.");
        }
    }

    public void reproducirGaleria() {
        System.out.println("\n▶ Recorriendo hacia adelante:");
        for (int i = 0; i < fotos.size(); i++) {
            System.out.println(fotos.get(i));
        }

        System.out.println("\n◀ Recorriendo hacia atrás:");
        for (int i = fotos.size() - 1; i >= 0; i--) {
            System.out.println(fotos.get(i));
        }
    }
}