import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total = 0;
        double promedio = 0;
        double prom5 = 0;
        double prom4 = 0;
        int count1 = 0;
        int count5 = 0;
        int count4 = 0;
        int N = 20;
        for(int i = 1; i < N+1; i++){
            System.out.println("Ingrese la nota de la materia numero "+ i);
            double nota = s.nextDouble();
            if (nota <= 0){
                System.out.println("error finalizando el programa.");
                break;
            }else if (nota > 5 ){
                prom5 = prom5 + nota;
                count5++;
            } else if (nota < 4) {
                prom4 = prom4 + nota;
                count4++;
            } else if (nota == 1) {
                count1++;
            }else {
                System.out.println("Error.");
                break;
            }
            promedio = promedio + nota;
            total = total + nota;
        }
        prom5 = prom5 / count5;
        prom4 = prom4 / count4;
        promedio = promedio / N;


        String mensaje = "El promedio de las notas mayores a 5 es: " + prom5 +
                "\nEl promedio de las notas inferiores a 4 es: "+ prom4 +
                "\nLa cantidad de notas 1 es:"+ count1 +
                "\nEl total es de: "+ total + ", por ende el promedio de 20 materias es: "+ promedio + ".";

        System.out.println(mensaje);
    }
}
