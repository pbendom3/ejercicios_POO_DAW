package festival;

public class Organizador extends Persona implements Organizable,Promocionable{

    private String rol;

    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol=rol;
    }

    public void mostrarInfo(){
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("ROl: " + rol);
    }

    public void organizarEvento() {
        System.out.println("Organizando el cotarro");
    }

    public void promocionar() {
        System.out.println("Promocionando...");
    }
}
