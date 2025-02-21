package festival;

public class EdadValidaException extends Exception{

    public EdadValidaException (){
        super("No puede acceder al festival si es menor de edad");
    }

}
