public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 345123;
        System.out.println("intObjeto = " + intObjeto);
        int num = intObjeto2;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valor = "67000";
        Integer valorStr = Integer.valueOf(valor);
        System.out.println("valorStr = " + valorStr);

        Short shortObj = intObjeto.shortValue();
        System.out.println("shortObj = " + shortObj);

        Byte byteObj = intObjeto.byteValue();
        System.out.println("byte = " + byteObj);

        Long longObj = intObjeto.longValue();
        System.out.println("long = " + longObj);




    }
}
