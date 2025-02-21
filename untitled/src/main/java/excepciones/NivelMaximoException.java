package excepciones;

public class NivelMaximoException extends RuntimeException{

    public NivelMaximoException(){
        super("el nivel no puede ser mayor a 100");
    }


}
