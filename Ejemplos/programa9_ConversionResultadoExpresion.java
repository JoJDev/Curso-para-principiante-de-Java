public class programa9_ConversionResultadoExpresion {
    public static void main(String[] args) {
        // Ejemplo 1

        byte b = 50; 
         
        //casting de tipo int a byte
        //mostraría error si no detallamos (byte)
        b = (byte)(b * 2); 
        System.out.println(b);
        System.out.println();

        // Ejemplo 2

        int varA;

        varA = (int)(3.1416 * 10);

        System.out.println("El resultado es: " + varA);
        System.out.println();

        // Ejemplo 3

        // el limite positivo de una variable tipo byte es de 127
        // si supera ese limite, se regresa desde en limite negativo y contando
        // 127, -128, -127, -126, -125, y asi, por eso, si le sumamos 5 al limite
        // positivo y convertimos en byte, sale un resultado negativo (-124)
        byte resultado =  (byte)(127 + 5);

        System.out.println("EL resultado de la expresion es: " + resultado);
    }
}