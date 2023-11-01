public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u00E6';
        System.out.println("caracter = " + caracter);

        var caracter2 = '\u00E6';
        System.out.println("caracter2 = " + caracter2);

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevalinea = '\n';
        char retornoCarro = '\r';


        System.out.println("Tipo Character corresponde en byte "+ tabulador + espacio + Character.BYTES);
        System.out.println("Tipo Character corresponde en BITES "+retroceso+ retroceso+ nuevalinea +Character.SIZE);
        System.out.println("Valor maximo de un Character: " + Character.MAX_VALUE);
        System.out.println("Valor minimo de un Character: " + Character.MIN_VALUE);

    }
}
