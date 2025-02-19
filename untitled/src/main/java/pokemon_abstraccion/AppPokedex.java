package pokemon_abstraccion;

public class AppPokedex {

    public static void main(String[] args) {

        Electrico pikachu = new Electrico(100);
        pikachu.atacar();
        pikachu.imprimirNivel();

        System.out.println();
        Fuego charmander = new Fuego(67);
        charmander.atacar();
        charmander.imprimirNivel();
        System.out.println();

        Agua squirtle = new Agua(100);
        squirtle.pistolaAgua();
        System.out.println();

        Pokemon[] pokemons = {new Agua(34),new Fuego(89),new Electrico(99)};
        for (Pokemon pok : pokemons){
            pok.atacar();

            if (pok instanceof AtaquesAgua){
                ((AtaquesAgua) pok).hidroBomba();
                ((AtaquesAgua) pok).pistolaAgua();
            }

            pok.imprimirNivel();

        }

    }
}
