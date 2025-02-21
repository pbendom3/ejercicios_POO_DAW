package enum_asignaturas;

import javax.script.ScriptEngineManager;

public enum Semaforo {

    AMARILLO,ROJO,VERDE;

    public Semaforo siguiente(Semaforo estado){

        switch (estado){
            case AMARILLO:
                return Semaforo.ROJO;
            case ROJO:
                return Semaforo.VERDE;
            case VERDE:
                return Semaforo.AMARILLO;
            default:
                return Semaforo.AMARILLO;
        }

    }

}
