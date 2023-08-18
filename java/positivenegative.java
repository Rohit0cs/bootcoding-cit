import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int x =sc.nextInt();
        if(x<0){
            System.out.println("number is negative!!");
        }else{
            System.out.println("number is positive!!");
        }
    }
}
