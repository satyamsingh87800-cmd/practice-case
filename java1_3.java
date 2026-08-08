import java.util.Scanner;

public class java1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WHAT IS YOUR NAME SIR");
        String name = sc.next();
        System.out.println("WELCOME " + name);

        sc.close();

    }
}
