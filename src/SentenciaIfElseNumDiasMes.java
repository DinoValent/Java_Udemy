import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numerosDias = 0;
        System.out.println("Ingrese el numero del mes del 1 - 12");
        int mes = s.nextInt();
    System.out.println("Ingrese el año");
        int anio = s.nextInt();



        if (mes ==1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12){
            numerosDias =31;
        }else if (mes ==4 || mes == 6 || mes == 9 || mes == 11 ){
            numerosDias = 30;
        }else if(mes == 2){
            if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numerosDias =29;
            }else{
                numerosDias=28;
            }
        }
        System.out.println("numerosDias = " + numerosDias);
    }
}
