package org.example;

import java.time.LocalDate;

public class Prestamo {

    private Estudiante estudiante;
    private Libro libro;
    private LocalDate fecha;

    public Prestamo (Estudiante estudiante, Libro libro){

        this.estudiante=estudiante;
        this.libro=libro;
        fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString(){
        return " Prestamo : [ estudiante=" + getEstudiante() + " libro=" + getLibro() + " fecha=" + getFecha() +" ]";
    }
}
