public class programa6_ConversionAutomatica {
    public static void main(String[] args) {
        
        byte numTipoByte = 10;

        // conversion automatica de una variable tipo byte a un int
        int numTipoInt = numTipoByte;       
        
        // conversion automatica de un int a un double
        double numTipoDouble = numTipoInt;

        System.out.println("la variable numTipoByte vale: " + numTipoByte);
        System.out.println("la variable numTipoInt vale: " + numTipoInt);
        System.out.println("la variable numTipoDouble vale: " + numTipoDouble);
    }
}