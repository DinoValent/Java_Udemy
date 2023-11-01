import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Ingrese el primer nombre y apellido");
        String name2 = JOptionPane.showInputDialog("Ingrese el segundo nombre y apellido");
        String name3 = JOptionPane.showInputDialog("Ingrese el tercer nombre y apellido");

        int n1 = name1.length();
        int n2 = name2.length();
        int n3 = name3.length();

        int max = n1 > n2 ? n1 : n2;
        max = max > n3 ? max : n3;

        String mensaje = max == n3 ? name3 + " tiene el nombre mas largo" :
                max == n2 ? name2 + " tiene el nombre mas largo" :
                        name1 + " tiene el nombre mas largo";

        System.out.println(mensaje);

    }
}
