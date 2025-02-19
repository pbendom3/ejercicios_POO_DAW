package dispositivos;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivos =  new ArrayList<>();
        listaDispositivos.add(new Televisor("LG Smart"));
        listaDispositivos.add(new Alexa("Alexa 3.0"));
        listaDispositivos.add(new AireAcondicionado("Misubisi"));
        listaDispositivos.add(new Televisor("Samsung comedor"));

        for (Dispositivo dispositivo : listaDispositivos){

            System.out.println("-------------------");
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();
        }


    }
}
