public class CatalogoBST {
    private Libro raiz;

    public CatalogoBST() {
        raiz = null;
    }

    public void insertar(long isbn, String titulo, String autor, int anio) {
        raiz = insertarRec(raiz, isbn, titulo, autor, anio);
    }

    private Libro insertarRec(Libro nodo, long isbn, String titulo, String autor, int anio) {
        if (nodo == null) {
            return new Libro(isbn, titulo, autor, anio);
        }
        if (isbn < nodo.isbn) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, isbn, titulo, autor, anio);
        } else if (isbn > nodo.isbn) {
            nodo.derecho = insertarRec(nodo.derecho, isbn, titulo, autor, anio);
        }

        return nodo;
    }

    public boolean existeISBN(long isbn) {
        return existeRec(raiz, isbn);
    }

    private boolean existeRec(Libro nodo, long isbn) {
        if (nodo == null) return false;
        if (isbn == nodo.isbn) return true;
        if (isbn < nodo.isbn) return existeRec(nodo.izquierdo, isbn);
        else return existeRec(nodo.derecho, isbn);
    }

    public void imprimirCatalogo() {
        imprimirInOrden(raiz);
    }

    private void imprimirInOrden(Libro nodo) {
        if (nodo != null) {
            imprimirInOrden(nodo.izquierdo);
            System.out.println(nodo.isbn + " - " + nodo.titulo + " - " + nodo.autor);
            imprimirInOrden(nodo.derecho);
        }
    }
}