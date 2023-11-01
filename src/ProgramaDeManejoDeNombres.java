import java.util.Scanner;

public class ProgramaDeManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de 3 familiares: ");
        String nombre1 =  scanner.nextLine().toUpperCase();
        String nombre2 =  scanner.nextLine().toUpperCase();
        String nombre3 =  scanner.nextLine().toUpperCase();

        String mensaje = (nombre1.charAt(1))+ "." +(nombre1.substring( nombre1.length()-2).toLowerCase())+ "_" +
                         nombre2.charAt(1)+ "." +(nombre2.substring( nombre2.length()-2).toLowerCase()) + "_" +
                          nombre3.charAt(1)+ "." +(nombre3.substring(nombre3.length()-2).toLowerCase());
        System.out.println(mensaje);
    }
}
