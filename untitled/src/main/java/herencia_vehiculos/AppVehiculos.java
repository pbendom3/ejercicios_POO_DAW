package herencia_vehiculos;

public class AppVehiculos {

    public static void main(String[] args) {
        Avion airbus =  new Avion("airbus","1234RTP",2);
        airbus.imprimirDatos();
        airbus.ruido();

        Tren ave = new Tren("AVE","3456TYP",8);
        ave.ruido();
        ave.imprimirDatos();

        Vehiculo ave2 = new Tren("Renfe","1234SDF",9);
        ave2.imprimirDatos();

    }

}
