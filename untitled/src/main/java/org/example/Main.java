package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Estudiante estudiante1 = new Estudiante("Paco");
        Estudiante estudiante2 = new Estudiante("Paco","2ºESO","noseque@edu.gva.es");

        System.out.println(estudiante1);
        System.out.println(estudiante2);

        if(Estudiante.validarEmail(estudiante2.getEmail())){
            System.out.println("El email es correcto");
        }else{
            System.out.println("El email no cumple con el formato");
        }

        Libro libro1 = new Libro("el principito","quevedo");
        System.out.println(libro1);
        Libro libro2 = new Libro("tiburon","torres");
        System.out.println(libro2);

        System.out.println(Libro.getLibrosDisponibles());
        libro1.prestar(estudiante2);
        System.out.println(estudiante2);
        System.out.println(libro1);
        System.out.println(Libro.getLibrosDisponibles());

        libro1.devolver(estudiante2);
        System.out.println(libro1);
        System.out.println(estudiante2);
        System.out.println(Libro.getLibrosDisponibles());
        libro1.devolver(estudiante2);

        libro1.estaDisponible();

    }




}