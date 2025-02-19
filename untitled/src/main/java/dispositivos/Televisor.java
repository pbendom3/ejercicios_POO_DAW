package dispositivos;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre) {
        super(nombre);
    }

    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }

    public void encender() {
        if(getEstado()){
            System.out.println("El televisor ya está encendido.");
        }else{
            System.out.println("Encendiendo televisor...");
            setEstado(true);
        }
    }


}
