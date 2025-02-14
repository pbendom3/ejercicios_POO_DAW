package netflix;

public class PlataformaStreaming {
    public static void main(String[] args) {

        Suscripcion[] suscripciones = {new PlanGratis("Gratis",0), new PlanPremium("Premium",14.99)};

        for (Suscripcion susc : suscripciones){
            susc.mostrarInfo();
            susc.obtenerBeneficios();
        }
    }
}
