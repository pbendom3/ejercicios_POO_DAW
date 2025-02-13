package correccion;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {

    public static final int VALORPUNTUACION = 10;
    public static final int MIEMBROS_MAX = 4;

    private String nombreEquipo;
    private ArrayList<String> listaMiembros;
    private int problemasResueltos;
    private int puntuacion;

    public Equipo(String nombreEquipo){

        this.nombreEquipo = nombreEquipo;
        listaMiembros = new ArrayList<>();
        problemasResueltos = 0;
        puntuacion = 0;
    }

    public void ficharMiembros(String... miembros){
        if (listaMiembros.size()+miembros.length>=MIEMBROS_MAX) {
            System.out.println("No se pueden inscribir más de " + MIEMBROS_MAX + "miembros.");

        }else{
            System.out.println("Nuevo miembro " );
            listaMiembros.addAll(Arrays.asList(miembros));
        }
    }

    public void calcularPuntos(){
        puntuacion = problemasResueltos*VALORPUNTUACION;
        System.out.println("Equipo "+ nombreEquipo + ". Puntuación =" + puntuacion);
    }





    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getProblemasResueltos() {
        return problemasResueltos;
    }

    public void setProblemasResueltos(int problemasResueltos) {
        this.problemasResueltos = problemasResueltos;
    }

    public ArrayList<String> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ArrayList<String> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", listaMiembros=" + listaMiembros +
                ", problemasResueltos=" + problemasResueltos +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
