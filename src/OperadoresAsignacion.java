public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 3;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        i += 2;
        System.out.println("i = " + i);
        i += 5;
        System.out.println("i = " + i);

        j -= 4;
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre'Andres'";
        sqlString += " and c.archivo1";
        System.out.println("sqlString = " + sqlString);
    }
}
