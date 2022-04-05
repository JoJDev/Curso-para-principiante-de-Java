import java.util.Scanner;

public class programa17_Scanner {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Quien eres?");
        String nombre = lector.nextLine();
        
        System.out.println(); //linea vacia para una mejor vista

        System.out.println("Hola " + nombre + ", es un gusto conocerte");
        
        System.out.println(); //linea vacia para una mejor vista
        lector.close();
    }
    
}
