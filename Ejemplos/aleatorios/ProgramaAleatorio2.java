package aleatorios;

import java.util.Random;

public class ProgramaAleatorio2 {
    public static void main(String[] args) {
        Random ruleta = new Random(); 
        
        double numAleatorio = ruleta.nextDouble();
        
        System.out.println(); //lineas vacias para una mejor vista
        
        System.out.println("Tu numero aleatore es: " + numAleatorio);
        
        System.out.println(); //lineas vacias para una mejor vista
    }

}
