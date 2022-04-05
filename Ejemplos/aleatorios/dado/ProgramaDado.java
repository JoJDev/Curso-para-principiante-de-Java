package aleatorios.dado;

import java.util.Random;

public class ProgramaDado {
    public static void main(String[] args) {
        Random ruleta = new Random(); 
        
        int numAleatorio = ruleta.nextInt(6) + 1;
        
        System.out.println(); //lineas vacias para una mejor vista
        
        System.out.println("Tu numero aleatore es: " + numAleatorio);
        
        System.out.println(); //lineas vacias para una mejor vista
    }
    
}