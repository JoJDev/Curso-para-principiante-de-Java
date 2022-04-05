public class programa13_SentenciaPrint2 {
    public static void main(String[] args) {
        System.out.println();
        
        int edad = 25;
        String nombre = "Jesus";

        System.out.println("Hola, soy " + nombre + " y tengo " + edad);
        
        String mensaje = String.format("Mido %.2f metros y peso ", 1.75);
        System.out.println(mensaje + 76 + " kilos");
        System.out.println();
    }
}