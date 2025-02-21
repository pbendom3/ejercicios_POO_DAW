package excepciones;

public class Main_excepciones {

    public static void main(String[] args) {

        int nivel = 150;


            if(nivel >100){
                throw new NivelMaximoException();
            }



    }
}
