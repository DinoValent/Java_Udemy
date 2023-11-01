import java.util.Scanner;

public class SistemaGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de litros de gasolina (Tenga en cuenta que la capacidad maxima es de 70 L)");
        int gas = s.nextInt();

        if(gas > 70){
            System.out.println("El tanque rebalsó");
        }if (gas == 70){
            System.out.println("El tanque esta lleno.");
        }if (gas >= 60 && gas < 70) {
            System.out.println("El tanque esta casi lleno.");
        }if (gas >= 40 && gas < 60) {
            System.out.println("El tanque esta 3/4.");
        }if ( gas >= 35 && gas < 40){
            System.out.println("El tanque esta a la mitad.");
        } if (gas >= 20 && gas < 35) {
            System.out.println("Suficiente gasolina");
        }if (gas >= 1 && gas < 20){
            System.out.println("Insuficiente");
        }if (gas <= 0) {
            System.out.println("Numero no valido.");
        }
    }
}
