package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner teclado = new Scanner(System.in);

        System.out.println("nombre?");
        String nombre = teclado.next();
        System.out.println("edad?");
        int edad = teclado.nextInt();
        System.out.println("género?");
        char genero = teclado.next().charAt(0);
        System.out.println("peso?");
        double peso = teclado.nextDouble();
        System.out.println("altura?");
        double altura = teclado.nextDouble();

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente(nombre,edad,genero);
        Paciente paciente3 = new Paciente(nombre,edad,genero,peso,altura);

        paciente1.setNombre("Llados");
        paciente1.setEdad(40);
        paciente1.setGenero('H');
        paciente1.setPeso(120);
        paciente1.setAltura(1.75);

        paciente1.imprimirInfo();
        paciente2.imprimirInfo();
        paciente3.imprimirInfo();

        mostrarMensajeIMC(paciente1);
        mostrarMensajeIMC(paciente2);
        mostrarMensajeIMC(paciente3);

        mayorEdad(paciente1);
        mayorEdad(paciente2);
        mayorEdad(paciente3);

        System.out.println(paciente1);


    }

    public static void mostrarMensajeIMC(Paciente paciente){

        int peso = paciente.calcularIMC();

        switch(peso){
            case Paciente.BAJO_PESO:
                System.out.println("El paciente " + paciente.getNombre() +  " está por debajo del peso ideal");
                break;
            case Paciente.PESO_IDEAL:
                System.out.println("El paciente " + paciente.getNombre() + " está en su peso ideal");
                break;
            case Paciente.SOBREPESO:
                System.out.println("El paciente " + paciente.getNombre() + " está por encima de su peso ideal");
                break;
        }

    }

    public static void mayorEdad(Paciente paciente){

        if(paciente.esMayorDeEdad()){
            System.out.println("El paciente " + paciente.getNombre() + " es mayor de edad");
        }else{
            System.out.println("El paciente " + paciente.getNombre() + " no es mayor de edad --> " + paciente.getEdad());
        }

    }


}