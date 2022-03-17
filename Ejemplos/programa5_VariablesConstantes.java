public class programa5_VariablesConstantes {
    public static void main(String[] args) {
        
        final double PI = 3.1416;

        double radio = 4;
        double areaCirculo1 = radio * PI;
        
        System.out.println("\nSalida:");
    
        System.out.println(areaCirculo1);

        radio = 42;
        double areaCirculo2 = radio * PI;

        System.out.println(areaCirculo2);
        System.out.println();
    }
}
