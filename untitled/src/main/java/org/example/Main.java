package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Paciente paciente1 = new Paciente("Luis",45,'H',90,1.90);
        paciente1.imprimirInfo();
        Paciente paciente2 = new Paciente();
        paciente2.imprimirInfo();




    }
}