package pokemon_abstraccion;

import festival.Persona;

public class Agua extends Pokemon implements AtaquesAgua{

    public Agua(int nivel) {
        super(nivel);
    }

    public void atacar() {
        System.out.println("SALPICADURAAAAAAAA");
    }

    public void pistolaAgua() {
        System.out.println("Flush flush");
    }

    public void salpicadura() {
        System.out.println("SALPICADURAAAAAAAA");
    }

    public void surf() {
        System.out.println("COGIENDO OLAAAASSS");
    }

    public void hidroBomba() {
        System.out.println("BOOOOOOOOOOOOM FLUSSSHHHHH");
    }
}
