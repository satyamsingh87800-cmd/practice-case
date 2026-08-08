import java.util.Scanner;

public class java1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR KM SIR/MAM");
        double input = sc.nextDouble();
        double b = 0.621371;
        double converter = input * b;

        System.out.println("SO YOUR KM HAVE BEEN CONVERTED IN TO MILES " + converter);

        sc.close();
    }
}
