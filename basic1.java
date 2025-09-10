import java.util.Scanner;
public class basic1 {
    public static void main(String[] args) {
        final float pi = 3.14f;
        // isse change nahi kar sakte

        // Math
        Math.max(5, 6);
        // max value dega - yani 6
        Math.min(5, 6);
        Math.sqrt(36);
        Math.abs(-4.7);
        Math.random(); // 0.0 to 1.0
        
        System.out.println((int)Math.random());
        // int me type cast kardiya

        // Input in Java
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        int age = sc.nextInt();
        // for float -- sc.nextFloat();
        // for int -- sc.nextInt();
        // for string -- sc.next();
        String name = sc.nextLine();
        // for input of String

        // Loops in Java
        // Do while loop
        int k = 100;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);

        // Function
        public static int sum(int a, int b) {
            return a + b;
        }
    }
}