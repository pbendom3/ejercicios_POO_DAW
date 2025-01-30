package org.example;

public class Libro {

    public static int cantidadLibros=0;
    public static int librosDisponibles=0;
    public static final String ID_LIBROS = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial){

        this.titulo=titulo;
        this.autor=autor;
        disponible=true;
        cantidadLibros++;
        librosDisponibles++;
        this.id=calcularID();//id calcular
        estudiantePrestado=null;
        this.editorial=editorial;
        editorial.insertarLibro(this);
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

    public Prestamo prestar(Estudiante estudiante){

        if(disponible && !estudiante.getLibrosPrestados().contains(this)) {
            disponible = false;
            System.out.println("El libro " + getTitulo() + " ha sido prestado con éxito a " + estudiante.getNombre());
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.anyadirLibro(this);
            Prestamo prestamo = new Prestamo(estudiante,this);
            System.out.println("Nuevo préstamo creado: " + prestamo);
            return prestamo;
        } else if (estudiante.getLibrosPrestados().contains(this)) {
            System.out.println("El estudiante " +  estudiante.getNombre() + " ya tiene ese libro prestado");
        }else{
            System.out.println("El libro " + getTitulo() + " no se puede prestar. (No disponible)");
        }

        return null;

    }

    public void devolver(Estudiante estudiante){

        if(!disponible){
            disponible=true;
            System.out.println("El libro " + getTitulo() + " ha sido devuelto con éxito por " + estudiantePrestado.getNombre());
            librosDisponibles++;
            estudiantePrestado=null;
            estudiante.borrarLibro(this);
        }else{
            System.out.println("El libro " + getTitulo() + " no se puede devolver. Está disponible.");
        }


    }

    public boolean getDisponible() {
        return disponible;
    }

    public void estaDisponible(){
        if(getDisponible()){
            System.out.println("El libro " + getTitulo()+ " está disponible.");
        }else{
            System.out.println("El libro " + getTitulo() + " no está disponible.");
        }
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

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString(){

        return "";//"Libro : [ titulo=" + getTitulo() + " autor=" + getAutor() + " id=" + getId() + " disponible=" + getDisponible() + " estudiantePrestado=" + " editorial=" + getEditorial() + " ]";
    }



}
