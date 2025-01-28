package org.example;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String CORREO_VALIDO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private Libro libroPrestado;

    public Estudiante(String nombre, String curso,String email){

        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        libroPrestado=null;
    }

    public Estudiante (String nombre){
        this.nombre=nombre;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
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

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    @Override
    public String toString(){

        if(libroPrestado!=null){
            return "Estudiante : [ nombre=" + getNombre() + " curso=" + getCurso() + " nia=" + getNia() + " email=" + getEmail() + " libroPrestado=" + libroPrestado.getTitulo() + "]";
        }else{
            return "Estudiante : [ nombre=" + getNombre() + " curso=" + getCurso() + " nia=" + getNia() + " email=" + getEmail() + "]";
        }

    }

    public static boolean validarEmail(String email){

        if(email.matches(CORREO_VALIDO)){
            return true;
        }

        return false;
    }




}
