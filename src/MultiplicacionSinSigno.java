import java.util.Scanner;

public class MultiplicacionSinSigno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero.");
        int num1 = s.nextInt();
        System.out.println("Ingrese un numero.");
        int num2 = s.nextInt();
        int rta = 0;
        if(num2 < 0 && num1 > 0){
            num2 = -num2;
            num1 = -num1;
        } else if (num2 < 0 && num1 < 0) {
            num2 = -num2;
            num1 = -num1;
        }
        for (int i = 0; i < num2; i++){
            rta = rta + num1;
        }
        System.out.println("El resultado de la multiplicacion es: "+ rta);
    }
}
