public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1 ,num2;
        num1 =1 ;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        Boolean objetoBoolean = Boolean.valueOf(primBoolean); //Boxing
        Boolean objetoBoolean2 =Boolean.valueOf("false");
        Boolean objetoBooleano3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("Comparado dos objetos Boolean: " + (objetoBoolean == objetoBoolean2));
        System.out.println("Comparado dos objetos Boolean: " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println("Comparado dos objetos Boolean: " + (objetoBoolean == objetoBooleano3));
        System.out.println("Comparado dos objetos Boolean: " + (objetoBoolean.equals(objetoBooleano3)));

        boolean primBoolean2 = objetoBoolean2.booleanValue(); //Unboxing


    }
}
