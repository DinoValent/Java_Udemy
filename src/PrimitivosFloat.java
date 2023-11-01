public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 1;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo Float corresponde en byte " + Float.BYTES);
        System.out.println("Tipo Float corresponde en BITES " + Float.SIZE);
        System.out.println("Valor maximo de un Float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un Float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo Double corresponde en byte " + Double.BYTES);
        System.out.println("Tipo Double corresponde en BITES " + Double.SIZE);
        System.out.println("Valor maximo de un Double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un Double: " + Double.MIN_VALUE);
        
        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
