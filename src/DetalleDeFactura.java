import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura:  ");
        String nombreFac =  scanner.nextLine();
        System.out.println("Ingrese el precio del primer producto");
        double prod1 = scanner.nextDouble();
        System.out.println("Ingrese el precio del segundo producto");
        double prod2 = scanner.nextDouble();
        double total = prod1 + prod2;
        double tasks = total+(total*0.19);
        String stringNombre = "El nombre de la factura es " + nombreFac ;


        String stringTotal = "\nEl total a pagar es de " + total + " con los impuestos agregados del %19 el precio seria " + tasks;
        String mensaje = stringNombre;
        mensaje += stringTotal;
        System.out.println(mensaje);
    }

}
