public class programa11_ObjetosEnvoltorio {
    public static void main(String[] args) {
        // Ejemplo 1
        String txt = "10404012";
        long num = Long.parseLong(txt);

        System.out.println("num convertido de un texto y sumandole 10:");
        System.out.println(num + 10);

        System.out.println();
        
        // Ejemplo 2

        // Tope máximo de almacenamiento de un int
        int maximo = Integer.MAX_VALUE; 
        
        // Mínimo de almacenamiento de un int
        int minimo = Integer.MIN_VALUE; 

        // Compara dos int dados en los paréntesis (separados por una coma), 
        // si el primero es mayor que el segundo, devuelve un 1,
        // si el primero es igual al segundo, da un cero
        // o si el primero es menor que el segundo, da un -1
        int comparacion = Integer.compare(maximo , minimo); 

        System.out.println("El maximo valor que puede guardar un int es: " + maximo);
        System.out.println("El valor minimo que puede guardar un int es: " + minimo);
        System.out.println("Comparando dos enteros, maximo vs minimo: " + comparacion);

        System.out.println();

        // Ejemplo 3

        String numeroEnTexto = "100";
        int numeroEntero = Integer.parseInt(numeroEnTexto);

        System.out.println("El numeroEntero es: " + numeroEntero);

        String nuevoTexto = Integer.toString(numeroEntero * 10);
        System.out.println("El valor de nuevoTexto es: " + nuevoTexto);
    }

}