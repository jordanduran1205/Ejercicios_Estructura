public class Cancion {
    String titulo;
    String artista;
    int duracion; // en segundos
    Cancion anterior;
    
    Cancion siguiente;

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.anterior = null;
        this.siguiente = null;

    }

    @Override
    public String toString() {
        return "Canción: " + titulo + " | Artista: " + artista + " | Duración: " + duracion + "s";
    }
}