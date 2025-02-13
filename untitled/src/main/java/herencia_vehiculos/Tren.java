package herencia_vehiculos;

public class Tren extends Vehiculo{

    private int vagones;

    public Tren(String marca, String matricula, int vagones) {
        super(marca, matricula);
        this.vagones=vagones;
    }

    public void ruido(){
        System.out.println("chucu chucu");
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Soy el tren que hace ");
        ruido();
    }

    public void prueba(){

    }



}
