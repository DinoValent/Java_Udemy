import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numerosDias = 0;
        System.out.println("Ingrese el numero del mes del 1 - 12");
        int mes = s.nextInt();
    System.out.println("Ingrese el año");
        int anio = s.nextInt();



        switch (mes ){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                numerosDias = 31;
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                numerosDias  = 30;
                break;
            case 2 :
                if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                    numerosDias =29;
                }else{
                    numerosDias=28;
                }
                break;
            default:
                System.out.println("Mes no valido");
        }
        System.out.println("numerosDias = " + numerosDias);
    }
}
