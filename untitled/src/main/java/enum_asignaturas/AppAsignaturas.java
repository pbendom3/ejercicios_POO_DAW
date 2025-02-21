package enum_asignaturas;

import java.util.Arrays;
import java.util.Scanner;

public class AppAsignaturas {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Asignaturas ipe = Asignaturas.IPE;
        System.out.println(ipe);

        for (Asignaturas asignatura : Asignaturas.values()){
            System.out.println("Asignatura " + asignatura + " que tiene " + asignatura.getHoras() + " horas anuales.");
        }

        System.out.println("Introduce un módulo " + Arrays.toString(Asignaturas.values()));
        String modulo = teclado.next();
        Asignaturas modulo_enum = Asignaturas.valueOf(modulo);
        System.out.println(modulo_enum);

        String ipe_string = ipe.name();
        System.out.println(ipe_string + " como string");

        int posicion = Asignaturas.BBDD.ordinal();
        System.out.println("Posición en el enum para BBDD " + posicion);

    }


}
