
package com.mycompany.tarea5;

public class Tarea5 {

    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        clase1.start();
        
        Clase2 Clase2 = new Clase2();
        Thread thread = new Thread(Clase2);
        thread.start();
    }
}
