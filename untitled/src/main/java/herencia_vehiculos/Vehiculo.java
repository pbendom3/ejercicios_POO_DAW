package herencia_vehiculos;

public class Vehiculo {

    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula){
        this.marca=marca;
        this.matricula=matricula;
    }

    public void imprimirDatos(){
        System.out.println("el vehículo con marca " + marca + " y matrícula " + matricula);
    }

    public void ruido (){
        System.out.println("pi piiiii");
    }

}
