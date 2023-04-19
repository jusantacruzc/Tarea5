package com.mycompany.tarea5;

import java.util.ArrayList;

public class Clase2 implements Runnable {

    public static final ArrayList<String> clase = new ArrayList<String>() {
        {
            add("Matematicas");
            add("Lengua");
            add("DESCANSO");
            add("Ingles");
            add("Programacion");
            add("DESCANSO");
            add("Catedra de Paz");
            
            add("Catedra de Paz");
            add("Lengua");
            add("DESCANSO");
            add("Ingles");
            add("Ingles");
            add("DESCANSO");
            add("Matematicas");
        }
    };

    public static final ArrayList<String> profesor = new ArrayList<String>() {
        {
            add("Omar");
            add("Daniel");
            add("Esteban");
            add("Esteban");
            add("Nicolas");
        }
    };

    @Override
    public void run() {

        try {
            int k = 0;
            for (int x = 0; x < 7; x++) {
                System.out.println("----------------------");
                System.out.println("SALON 202");
                System.out.println("Clase Actual: " + clase.get(x));
                if (!"DESCANSO".equals(clase.get(x))) {
                    System.out.println("Profesor Actual: " + profesor.get(k));
                    k++;
                } else {
                    System.out.println("");
                }
                System.out.println("---------------------- \n");
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
