package pokemon_abstraccion;

public abstract class Pokemon {

    private int nivel;

    public Pokemon(int nivel){
        this.nivel=nivel;
    }

    public abstract void atacar();

    public void imprimirNivel(){
        System.out.println("Nivel: " + nivel);
    }

}
