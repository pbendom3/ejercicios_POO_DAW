package festival;

public class Persona {

    private static final int EDAD_MIN=18;

    String nombre;
    int edad;

    public Persona(String nombre, int edad) throws EdadValidaException {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadValidaException {
        if(edad<EDAD_MIN){
            throw new EdadValidaException();
        }
        this.edad = edad;
    }

}