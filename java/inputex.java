import java.util.Scanner;

public class inputex {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number");
        int n =sc.nextInt();
        System.out.println("enter second number");
        int m =sc.nextInt();

        int add =n+m;
        System.out.println("addition="+add);

        int mul =n*m;
        System.out.println("multiplication="+mul);

        int sub =n-m;
        System.out.println("subtraction="+sub);

        int div =n/m;
        System.out.println("divison="+div);

        int mod =n%m;
        System.out.println("modulos="+mod);



    }
}
