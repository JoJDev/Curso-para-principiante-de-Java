public class programa10_ParsearTexto {
    public static void main(String[] args) {
        // Ejemplo 1
        String texto = "5";

        int numero = Integer.parseInt(texto);

        // Si sumas dos cadenas de texto, se concatenan (unen). 
        // Si sumas dos enteros, realmente se suman
        System.out.println("texto + texto :" );
        System.out.println(texto + texto);
        System.out.println("numero + numero :" );
        System.out.println(numero + numero);

        System.out.println();
        
        // Ejemplo 2

        String textoGrande = "5803";

        //En vez de .parseInt() podemos usar .valueOf() y tendría el mismo efecto
        int numeroEntero = Integer.valueOf(textoGrande);
        
        // Si hay texto sumando a un tipo numerico, Java transforma 
        // automaticamente el numero a texto para asi concatenarlo
        System.out.println("textoGrande + 2 : " );
        System.out.println(textoGrande + 2);
        System.out.println("numeroEntero + 2 :" );
        System.out.println(numeroEntero + 2);
        
        System.out.println();
        
        // Ejemplo 3

        String textoDecimal = "1.8";

        // Si queremos double en vez de int, la sintaxis solo cambia en sustituir 
        // el "Integer" por un "Double" (no olvide la primera letra en mayúscula)
        double numeroDecimal1 = Double.parseDouble(textoDecimal);
        double numeroDecimal2 = Double.valueOf("7.2");

        System.out.println("textoDecimal + '7.2' :");
        System.out.println(textoDecimal + "7.2");
        System.out.println("numeroDecimal1 + numeroDecimal2 :");
        System.out.println(numeroDecimal1 + numeroDecimal2);
    }
    
}