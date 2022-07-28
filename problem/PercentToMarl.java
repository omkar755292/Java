package problem;

import java.util.Scanner;

public class PercentToMarl {

  public static void main(String[] args) {
    int biology , math , chemistry, physics, marathi;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the mark of biology");
        biology = scan.nextInt();
        System.out.println("enter the mark of chemisty");
        chemistry = scan.nextInt();
        System.out.println("enter the mark of maths");
        math = scan.nextInt();
        System.out.println("enter the mark of marathi");
        marathi = scan.nextInt();
        System.out.println("enter the mark of physics");
        physics = scan.nextInt();
        float percentage = (biology+chemistry+physics+math+marathi)/5;
        System.out.println("total percentage is equal to :"+ percentage);
        scan.close();
  }
    
}
