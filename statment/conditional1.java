package statment;
import java.util.Scanner;

public class conditional1 {
    public static void main(String[] args) {
        int unit , bill;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a unit ");
        unit=scan.nextInt();
        if (unit<50) {
            bill = unit * 5;
            System.out.println(bill);
        }
        else if (51<unit && unit<100) {
            bill = unit * 7;
            System.out.println(bill);
        }
         else {
            bill = unit * 9;
            System.out.println(bill);
        }
        scan.close();
    }
}
