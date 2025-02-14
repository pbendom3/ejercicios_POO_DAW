package netflix;

public abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio){
        this.nombrePlan=nombrePlan;
        this.precio=precio;
    }

    public abstract void obtenerBeneficios();

    public void mostrarInfo(){
        System.out.println("Plan: " + nombrePlan +  " con precio: " + precio);
    }


}
