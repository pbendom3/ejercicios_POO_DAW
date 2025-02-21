package enum_asignaturas;

public class AppSemaforo {

    public static void main(String[] args) {

        Semaforo actual = Semaforo.VERDE;

        for (int i = 0; i < 10; i++) {
            actual = actual.siguiente(actual);
            System.out.println(actual);
        }


    }
}
