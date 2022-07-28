import java.util.Scanner;

class Emloyee{
    private int salary ;
    private String name;
    public int getSalary() {
        System.out.println("enter the salary");
        Scanner scan = new Scanner(System.in);
        salary= scan.nextInt();
        return salary;
    }
    public String getName() {
        System.out.println("enter the name");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        return name;
    }
    public void detail(int salary , String name) {
        System.out.println(salary);
        System.out.println(name);
      }
}
public class oops {
    public static void main(String[] args) {
        Emloyee omkar = new Emloyee();
        Emloyee vaibhav = new Emloyee();
        omkar.detail(omkar.getSalary(), omkar.getName());
        vaibhav.detail(vaibhav.getSalary(), vaibhav.getName());
    }
}
