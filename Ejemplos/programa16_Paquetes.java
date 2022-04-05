import java.util.Random;

public class programa16_Paquetes {
    public static void main(String[] args) {
        Random ruleta = new Random(); 
        
        int numAleatorio = ruleta.nextInt();
        
        System.out.println(); //linea vacia para una mejor vista
        
        System.out.println("Tu numero aleatore es: " + numAleatorio);
        
        System.out.println(); //linea vacia para una mejor vista
    }
    
}