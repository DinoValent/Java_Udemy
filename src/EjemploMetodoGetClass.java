import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal!";

        Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass.getName());
        System.out.println("strClass = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for (Method metodo : strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        Integer num = 34;
        Class inClass = num.getClass();
        Class objClass =  inClass.getSuperclass().getSuperclass();
        System.out.println("inClass = " + inClass.getSuperclass());
        System.out.println("objClass = " + objClass);


        for (Method metodo : objClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }


}
