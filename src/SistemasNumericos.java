import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr =  JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;

        try{
            numeroDecimal =Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero.");
            main(args);
            System.exit(0);
        }
        String resultadoBinario = "Numero binario de = " + numeroDecimal + " + " + Integer.toBinaryString(numeroDecimal);

        int numeroBinario = 0b111111111;


        String resultadoOctal = "\nNumero octal de = " + numeroBinario + " + " + Integer.toOctalString(numeroDecimal);

        int numeroOctal = 0764;

        String resultadoHex = "\nNumero hexadecimal de = " + numeroOctal  + " = " + Integer.toHexString(numeroDecimal);

        
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje  = resultadoBinario;
        mensaje +=  resultadoOctal;
        mensaje +=  resultadoHex;
        JOptionPane.showMessageDialog(null,  mensaje);


    }
}
