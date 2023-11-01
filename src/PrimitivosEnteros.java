public class PrimitivosEnteros {
    public static void main(String[] args) {

       byte numeroByte = 10;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en BITES " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);


        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte " + Short.BYTES);
        System.out.println("Tipo Short corresponde en BITES " + Short.SIZE);
        System.out.println("Valor maximo de un Short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un Short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte " + Integer.BYTES);
        System.out.println("Tipo int corresponde en BITES " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Long corresponde en byte " + Long.BYTES);
        System.out.println("Tipo Long corresponde en BITES " + Long.SIZE);
        System.out.println("Valor maximo de un Long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long: " + Long.MIN_VALUE);

        var numeroVar = 9223372036854775808F;


    }
}
