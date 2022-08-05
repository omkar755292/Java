package statment;
import java.util.Scanner;

public class switch1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a age");
        age = scan.nextInt();
        switch (age) {
            case 18:
                System.out.println("you are 18 ");
                break;
                case 20:
                System.out.println("you are 20 ");
                break;
                case 30:
                System.out.println("you are 30 ");
                break;
                default:
                System.out.println("you are not match");
                break;
            }scan.close();
        }
}
