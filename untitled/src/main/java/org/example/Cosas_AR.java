package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Cosas_AR {

    public static void main (String[] args){

        ArrayList<Integer> listaNums = new ArrayList<>();

        listaNums.add(3);
        listaNums.add(10);
        listaNums.add(90);
        listaNums.add(54);

        System.out.println(listaNums.get(0));
        listaNums.remove(0);
        System.out.println(listaNums.get(0));
        listaNums.remove((Integer) 90);
        System.out.println(listaNums);
        System.out.println(listaNums.indexOf(54));
        System.out.println(listaNums.size());

        for (int i = 0; i < listaNums.size(); i++) {
            System.out.print(listaNums.get(i));
        }

        for (int nums : listaNums){
            System.out.print(nums);
        }

        listaNums.set(0,42);
        System.out.println(listaNums.get(0));

        ArrayList<Integer> listaNums_copia = (ArrayList<Integer>) listaNums.clone();
        System.out.println(listaNums_copia);

        listaNums_copia.clear();
        System.out.println(listaNums_copia);

        if(listaNums.contains(42)){
            System.out.println("La lista contiene el 42");
        }else{
            System.out.println("La lista no contiene el 42");
        }

        if(listaNums.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            System.out.println("La lista no está vacía");
        }

        listaNums.addAll(Arrays.asList(2,3,4,5));
        System.out.println(listaNums);
        anyadirVarios(listaNums, 6,7,8,9);
        System.out.println(listaNums);
    }

    public static void anyadirVarios(ArrayList<Integer> lista, Integer... nums){
        lista.addAll(Arrays.asList(nums));
    }

}
