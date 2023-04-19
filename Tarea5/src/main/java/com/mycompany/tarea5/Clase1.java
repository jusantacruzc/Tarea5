package com.mycompany.tarea5;

import java.util.ArrayList;

public class Clase1 extends Thread {

    public static final ArrayList<String> clase = new ArrayList<String>() {{
        add("Matematicas"); 
        add("Lengua");
        add("DESCANSO");
        add("Ingles");
        add("Programacion");
        add("DESCANSO");
        add("Catedra de Paz");
    }};
    
    public static final ArrayList<String> profesor = new ArrayList<String>() {{
        add("Ricardo"); 
        add("Ana");
        add("Patricia");
        add("Hernando");
        add("Oscar");
    }};

    @Override
    public void run() {
        try {
            int k = 0;
            for (int x = 0; x < 8; x++) {
                System.out.println("----------------------");
                System.out.println("SALON 101");
                System.out.println("Clase Actual: " + clase.get(x));
                if(!"DESCANSO".equals(clase.get(x))){
                    System.out.println("Profesor Actual: " + profesor.get(k));
                    k++;
                } else{
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
