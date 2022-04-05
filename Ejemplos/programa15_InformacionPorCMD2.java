public class programa15_InformacionPorCMD2 {
    public static void main(String[] args) {
        
        String nombre = args[0];
        String apePaterno = args[1];
        String apeMaterno = args[2];
        String edad = args[3];

        System.out.println("Hola " + nombre + apePaterno + apeMaterno);
        System.out.println("Veo que tienes " + edad + " años, que bien");
    }   
}
