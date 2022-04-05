public class programa7_conversionExplicita {
    public static void main(String[] args) {
       
        double numeroDouble= 5.9;

        // convertimos explicitamente el valor o la variable poniendo
        // en parentesis antes de la variable el tipo a que queremos convertir
        int numeroInt = (int)numeroDouble;

        System.out.println("El numero double es: " + numeroDouble);
        System.out.println("El numero int es: " + numeroInt);
        System.out.println();

        // Ejemplo 2

        int numeroInt2 = (int)41.205;
        
        System.out.println("El valor de 41.205 convertido en int = " + numeroInt2);
        System.out.println();

        // Ejemplo 3

        long numeroLong = 14;
        short numeroShort = (short)numeroLong;

        System.out.println("El numero long es: " + numeroLong);
        System.out.println("El numero short es: " + numeroShort);
    }
}
