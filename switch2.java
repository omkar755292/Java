import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        int day ;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number between 1 to 7");
        day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("today is a monday");
                break;
            case 2:
                System.out.println("today is a Tuseday");
                break;
            case 3:
                System.out.println("today is a wedneday");
                break;
            case 4:
                System.out.println("today is a thursday");
                break;
            case 5:
                System.out.println("today is a frieday");
                break;
            case 6:
                System.out.println("today is a saturday");
                System.out.println("today is weak day");
                break;
                case 7:
                System.out.println("today is a sunday");
                System.out.println("today is weak day");
                break;
        
            default:
            System.out.println("did not match the answer");
                break;
        }scan.close();
    }
}
