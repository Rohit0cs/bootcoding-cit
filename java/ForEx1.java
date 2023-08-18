import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = s.nextInt();
        System.out.println("even numbers");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
        }
        System.out.println("\n odd number");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "");
            }
        }
    }
}
