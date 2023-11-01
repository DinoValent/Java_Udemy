import java.util.Scanner;

public class DosNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int n1 = s.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int n2 = s.nextInt();


        String mensaje = (n1 > n2 ? "El numero mayor es " + n1 + " y el segundo " + n2 : "El numero mayor es " + n2 + " y el segundo " + n1);
        System.out.println(mensaje);
    }
}
