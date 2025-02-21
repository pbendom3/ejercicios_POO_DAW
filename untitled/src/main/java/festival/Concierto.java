package festival;

public class Concierto {
    public static void main(String[] args) throws EdadValidaException {

        Asistente a1 = new Asistente("Carlos", 15, TipoEntrada.VIP);
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        Organizador org = new Organizador("Pepe",35,"director");
        org.mostrarInfo();

        Persona[] personas = {
                new Asistente("Lucas", 18, TipoEntrada.VIP),
                new Artista("Sofía", 25, "Rock Alternativo"),
                new Organizador("Martín", 30, "Producción")
        };

        for (Persona p : personas) {
            p.mostrarInfo(); //se ejecuta la versión sobrescrita de cada subclase

            if(p instanceof Organizable && p instanceof Promocionable){
                ((Organizable) p).organizarEvento();
                ((Promocionable) p).promocionar();
            }



        }

        for (TipoEntrada entrada : TipoEntrada.values()){
            System.out.println("Entrada de tipo " + entrada +  " con un precio de " + entrada.getPrecio() + "€");
        }


    }
}