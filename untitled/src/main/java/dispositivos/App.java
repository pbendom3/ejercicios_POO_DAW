package dispositivos;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivos =  new ArrayList<>();
        listaDispositivos.add(new Televisor("LG Smart"));
        listaDispositivos.add(new Alexa("Alexa 3.0"));
        listaDispositivos.add(new AireAcondicionado("Misubisi"));
        listaDispositivos.add(new Televisor("Samsung comedor"));


        Dispositivo proyector = new Dispositivo("Electronik") {
            @Override
            public void encender() {
                if(getEstado()){
                    System.out.println("El proyector ya está encendido");
                }else{
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    setEstado(true);
                }
            }
        };

        ControlRemoto proyector_control = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        Dispositivo horno = new Dispositivo("Balay hot") {
            @Override
            public void encender() {
                if(getEstado()){
                    System.out.println("El horno ya está encendido");
                }else{
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    setEstado(true);
                }
            }
        };

        listaDispositivos.add(horno);
        listaDispositivos.add(proyector);

        for (Dispositivo dispositivo : listaDispositivos){

            System.out.println("-------------------");
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.getNombre().equals("Electronik")) {
                proyector_control.sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();

        }


    }
}
