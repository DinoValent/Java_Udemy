import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "Dino";
        passwords[0] = "12345";

        usernames[1]= "Admin";
        passwords[1] = "12345";

        usernames[2]= "Giovi";
        passwords[2] = "54321";*/

        String[] usernames = {"Dino", "Admin", "Pepe"};
        String[] passwords = {"12345", "12345", "54321"};


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Username:");
        String u = scanner.next();

        System.out.println("Ingrese la contraseña:");
        String p = scanner.next();
        boolean esAutenticado = false;

        for(int i = 0; i< usernames.length; i++){
            esAutenticado = usernames[i].equalsIgnoreCase(u) && (passwords[i].equalsIgnoreCase(p)) ? true : esAutenticado;
            /*
            if(usernames[i].equalsIgnoreCase(u) && (passwords[i].equalsIgnoreCase(p))){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!"):
                "Username o password incorrecto. \nLo sentimos, requiere autenticacion.";

        System.out.println(mensaje);
       /* if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("Username o password incorrectos.");
            System.out.println("Lo siento, requiere autenticación.");
        }*/
    }
}
