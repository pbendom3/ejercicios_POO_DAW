package org.example;

import java.util.Random;

public class Paciente {

    public final static char GENERO_DEF = 'X';
    public final static int BAJO_PESO = -1;
    public final static int PESO_IDEAL = 0;
    public final static int SOBREPESO = 1;
    public static final int EDAD_ADULTA = 18;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private double altura;

    public Paciente(){
//        this.genero=GENERO_DEF;
//        generarDni();
        this("",0,GENERO_DEF,0.0,0.0);
    }

    public Paciente(String nombre, int edad, char genero){
        this(nombre,edad,genero,0.0,0.0);
    }

    public Paciente(String nombre, int edad, char genero, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        setGenero(genero);
        this.peso=peso;
        this.altura=altura;
        generarDni();
    }

    private void generarDni(){

        Random aleatorio = new Random();
        int numeroDni = aleatorio.nextInt(10000000,99999999);
        int resto = numeroDni%23;
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        this.dni= Integer.toString(numeroDni) + letras[resto];
    }

    public void imprimirInfo(){

        System.out.println(this.nombre +" "+ this.edad +" "+  this.genero +" "+  this.dni +" "+  this.altura +" "+  this.peso);

    }

    public int calcularIMC(){

        double resultado = peso / Math.pow(altura,2);

        if(resultado<20){
            return BAJO_PESO;
        } else if (resultado>25) {
            return SOBREPESO;
        }else{
            return PESO_IDEAL;
        }

    }

    public boolean esMayorDeEdad(){

        if(edad>=EDAD_ADULTA){
            return true;
        }

        return false;
    }

    private void comprobarGenero(char genero){

        if(genero=='H' || genero=='M'){
            this.genero=genero;
        }else{
            this.genero=GENERO_DEF;
        }

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getDni(){
        return dni;
    }

    public char getGenero(){
        return genero;
    }

    public void setGenero(char genero){
        comprobarGenero(genero);
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    @Override
    public String toString(){
        return "Paciente : [ nombre=" + this.nombre + " edad=" + this.edad + " genero=" + this.genero + " peso=" + this.peso + " altura=" + this.altura + "]";
    }
    



}
