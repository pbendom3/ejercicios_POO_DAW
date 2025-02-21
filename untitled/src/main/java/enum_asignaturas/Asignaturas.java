package enum_asignaturas;

public enum Asignaturas {

    PROGRAMACION(256),IPE(96),BBDD(224),LENGUAJE_MARCAS(96),SISTEMAS_INFORMATICOS(160),PROYECTO_INTERMODULAR(32),ENTONOS_DESARROLLO(96);

    private int horas;

    Asignaturas(int horas){
        this.horas=horas;
    }

    public int getHoras() {
        return horas;
    }


}
