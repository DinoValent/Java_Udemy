public class ConversionDeTipos {
    public static void main(String[] args) {
        var numeroStr = "50";

        var numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        var realStr = "98765.43e-3";

        var realdDouble = Double.parseDouble(realStr);
        System.out.println("realdDouble = " + realdDouble);

        var logicoStr = "true";
        var logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt );
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1234.56;

        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32770;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

        char b = (char) i;
        System.out.println("b = " + b);
        
        float f = (float) i;
        System.out.println("f = " + f);
        
        

    }
}
