public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String  a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
           //c = c.concat(a).concat(b).concat("\n"); // 500 => 3ms, 1000 => 6ms, 10000 => 233ms
            c += a + b + "\n"; //500 => 20ms, 1000 => 17ms ,  10000 => 83ms
            //sb.append(a).append(b).append("\n"); //500 => 0ms, 1000 =>  0ms, 10000 3ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
