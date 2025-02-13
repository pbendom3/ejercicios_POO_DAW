package correccion;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {

    private static final String SEDE_DEF = "MUTXAMEL";
    private static final int EQUIPOS_MAX = 20;
    Scanner teclado = new Scanner(System.in);


    private String sede;
    private LocalDate fecha;
    private ArrayList<Equipo> listaEquipos;

    public Concurso(){
        sede=SEDE_DEF;
        setFecha();
        listaEquipos = new ArrayList<>();
    }



    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha() {
        System.out.println("Cuando sera el concurso?");
        System.out.println("Dia?");
        int dia= teclado.nextInt();
        System.out.println("MeS:");
        int mes = teclado.nextInt();
        System.out.println("año: ");
        int anyo = teclado.nextInt();
        this.fecha = LocalDate.of(anyo,mes,dia);
    }
    public void inscribirEquipo(Equipo equipo){
        if (listaEquipos.size()>EQUIPOS_MAX){
            System.out.println("No se pueden inscribir más de " + EQUIPOS_MAX + " equipos.");
        }else{
            System.out.println("Nuevo equipo " + equipo.getNombreEquipo() + " inscrito.");
            listaEquipos.add(equipo);
        }
    }
    public void imprimirDatosEquipos(){

        System.out.println("Equipos inscritos: " + listaEquipos.size());
        for(Equipo eq : listaEquipos){
            System.out.println("- " + eq.getNombreEquipo() + ". " + eq.getListaMiembros());
        }
    }
    public void equipoGanador(){

        Equipo ganador = listaEquipos.get(0);

        for (Equipo eq : listaEquipos){
            if(eq.getPuntuacion()>ganador.getPuntuacion()){
                ganador=eq;
            }
        }

        System.out.println("El equipo ganador ha sido " + ganador.getNombreEquipo() + " con " + ganador.getPuntuacion() + " puntos.");

    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "teclado=" + teclado +
                ", sede='" + sede + '\'' +
                ", fecha=" + fecha +
                ", listaEquipos=" + listaEquipos +
                '}';
    }
}
