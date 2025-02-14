package empresa;

public class AppEmpresa {

    public static void main(String[] args) {

        Empleado[] empleados = {new Desarrollador(),new Disenyador()};

        for (Empleado emp : empleados){
            emp.realizarTarea();

        }

        System.out.println();
        Empleado desarrollador = new Desarrollador();
        asignarTarea(desarrollador);
        Empleado disenyador =  new Disenyador();
        asignarTarea(disenyador);

    }

    public static void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }
}
