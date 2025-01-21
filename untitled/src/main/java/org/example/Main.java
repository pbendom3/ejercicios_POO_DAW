package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Paco","Ruiz","12345678A",'H',45);

        persona1.mostrarInfo();
        persona2.mostrarInfo();
        System.out.println(persona2.concatenar());

        System.out.println("La edad de " +  persona2.getNombre() + " es " +  persona2.getEdad());
        persona1.setApellido("Sin Nombre");
        System.out.println(persona1.getApellido());
        persona1.setNombre("Messi");
        System.out.println(persona1.getNombre());

        Persona persona3 = new Persona("messi","Ruiz","12345678A",'H',45);
        persona3.mostrarInfo();


    }
}