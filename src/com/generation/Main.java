package com.generation;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        String universidades[];
        universidades = new String[7];
        universidades[0] = "ITVH";
        universidades[1] = "ULA";
        universidades[2] = "UAM";
        universidades[3] = "UNADM";
        universidades[4] = "UNAM";
        universidades[5] = "TPN";
        for ( String universidad : universidades){
            System.out.println(universidad);
        }
        */

        Set<String> frutas = new HashSet(2);
        // la acaracteristica principal de sel es que no puede tener elementos duplicados
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("---------------------");

        //treeSet ordena los elementos
        Set<String> frutas2 = new TreeSet<>();

        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");
        for (String fruta : frutas2) {
            System.out.println(fruta);
        }


        System.out.println("---------------------");

        //treeSet ordena los elementos
        Set<String> frutas3 = new LinkedHashSet<>(4);

        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");
        for (String fruta : frutas3) {
            System.out.println(fruta);
        }


        System.out.println("---------------------");
        /*
        //list
        Set<String> frutas3 = new LinkedHashSet<>(3);

        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");
        for (String fruta : frutas3){
            System.out.println(fruta);
        }
        System.out.println(frutas3);
        int indice = frutas3.(fruta);

         */

        System.out.println("---------------------");

        //treeSet ordena los elementos
        List<String> frutas4 = new ArrayList<>();

        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");
        for (String fruta : frutas4) {
            System.out.println(fruta);
        }
        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Melon");


        System.out.println("---------------------");

        //treeSet ordena los elementos
        List<String> frutas5 = new ArrayList<>();

        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melon");
        frutas5.add("Lima");
        for (String fruta : frutas5) {
            System.out.println(fruta);
        }
        //hace refrencia a claves con valores
        //no puede tener claves repetidas
        //solo puede

        System.out.println("---------------------");
        Map<Integer, String> universidades = new HashMap<>();
        universidades.put(1, "IPN");
        universidades.put(2, "UNAM");
        universidades.put(3, "UAEM");
        universidades.put(4, "UAM");
        universidades.put(1, "TESCO");


        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }
        System.out.println(universidades.get(3));



        System.out.println("--------Alfonso Cruz Quiroz-------------");

        /*
        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));*/



    }
}
