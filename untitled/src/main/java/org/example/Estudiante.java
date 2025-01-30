package org.example;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String CORREO_VALIDO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

    public Estudiante(String nombre, String curso,String email){

        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public Estudiante (String nombre){
        this.nombre=nombre;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCurso(){
        return curso;
    }

    public int getNia(){
        return nia;
    }

    public String getEmail(){
        return email;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setCurso(String curso){
        this.curso=curso;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void anyadirLibro(Libro libro){
        librosPrestados.add(libro);
    }

    public void borrarLibro(Libro libro){
        librosPrestados.remove(libro);
    }

    @Override
    public String toString(){

//        if(!librosPrestados.isEmpty()){
            return "Estudiante : [ nombre=" + getNombre() + " curso=" + getCurso() + " nia=" + getNia() + " email=" + getEmail() + " libroPrestado=" + librosPrestados + "]";
//        }else{
//            return "Estudiante : [ nombre=" + getNombre() + " curso=" + getCurso() + " nia=" + getNia() + " email=" + getEmail() + "]";
//        }

    }

    public static boolean validarEmail(String email){

        if(email.matches(CORREO_VALIDO)){
            return true;
        }

        return false;
    }




}
