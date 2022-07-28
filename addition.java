import java.util.Scanner;

/**
 * addition
 */
public class addition {

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
            System.out.println("enter the value of a");
            a = scan.nextInt();
            System.out.println("enter the value of b");
            b = scan.nextInt();
            int c = a+b;
            System.out.println("enter your name");
            String d = scan.next();
        System.out.println("The addition of a and b is : "+c);
        System.out.println("your name is : "+d);
        scan.close();

    }
}