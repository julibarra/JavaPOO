public class Libro {
    private String titulo, isbn, autor;
    private boolean estado;

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        estado= true;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String prestamo(){
        if (isEstado()){
            setEstado(false);
            return "Prestando libro";

        }else {
            return "No se puede prestar el libro";
        }

    }
    public String devolucion(){
        if (!isEstado()){
            setEstado(true);
            return "Libro devuelto";

        }else {
            return "No es necesario devolver el libro";
        }

    }

    @Override
    public String toString() {
        return titulo +", "+ isbn+", "+autor;
    }
}
