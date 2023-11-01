import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7== 7 ? "Si , es verdadero" : "No, es falso";
        System.out.println("variable = " + variable);

        String estado ="";
        double promedio = 5.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de Matematica: ");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de Ciencias: ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de Historia: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);
    }
}
