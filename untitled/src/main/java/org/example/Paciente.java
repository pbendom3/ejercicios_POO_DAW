package org.example;

import java.util.Random;

public class Paciente {

    public final static char GENERO_DEF = 'X';
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

    public Paciente(String nombre, int edad, char genero, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
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




}
