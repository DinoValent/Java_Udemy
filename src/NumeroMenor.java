import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que deseea ingresar.");
        int N = s.nextInt();
        int min = 0;
        for (int i = 0 ; i < N; i++){
            System.out.println("Ingrese un numero entero.");
            int num = s.nextInt();
            if(i == 0 ){
                min = num;
            } else if(num < min){
                min = num;
            }
        }
        if (min < 10){
            System.out.println("El numero "+min +" es menor que 10!" );
        }else {
            System.out.println("El numero "+min+" es igual o mayor que 10!");
        }
    }
}
