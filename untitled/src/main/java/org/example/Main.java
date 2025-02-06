package org.example;

import org.example.biblioteca.Editorial;
import org.example.biblioteca.Estudiante;
import org.example.biblioteca.Libro;
import org.example.pruebas_lombok.Instituto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try{
            Instituto balmis = new Instituto(null,"Alicante");
            System.out.println(balmis);
        } catch (NullPointerException e){
            System.out.println("El nombre no puede ser nulo");
        }

      //  Instituto alluser = new Instituto("Alluser","Mutxamel","Direccion calle falsa 123");
      //  System.out.println(alluser);


    }

}