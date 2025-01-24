package org.example;

public class Libro {

    public static int cantidadLibros=0;
    public static int librosDisponibles=0;
    public static final String ID_LIBROS = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    public Libro(String titulo, String autor){

        this.titulo=titulo;
        this.autor=autor;
        disponible=true;
        cantidadLibros++;
        librosDisponibles++;
        this.id=calcularID();//id calcular

    }

    private String calcularID(){
//        if (cantidadLibros<10){
//            return ID_LIBROS+"00"+cantidadLibros;
//        } else if (cantidadLibros<100) {
//            return ID_LIBROS+"0"+cantidadLibros;
//        }else {
//            return ID_LIBROS+cantidadLibros;
//        }

        return ID_LIBROS + String.format("%03d",cantidadLibros);
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public static int getTotalLibros() {
        return cantidadLibros;
    }

    public String toString(){
        return "Libro : [ titulo=" + getTitulo() + " autor=" + getAutor() + " id=" + getId() + " disponible=" + getDisponible() + " ]";
    }



}
