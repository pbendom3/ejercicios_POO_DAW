package dispositivos;

public class Alexa extends Dispositivo{

    public Alexa(String nombre) {
        super(nombre);
    }

    public void encender() {
        if (getEstado()){
            System.out.println("Alexa ya está encendida.");
        }else{
            System.out.println("Activando Alexa con comando de voz...");
            setEstado(true);
        }
    }
}
