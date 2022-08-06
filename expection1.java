import java.util.Scanner;

class myExeption extends Exception{
    public String toString(){
        return super.toString() + "i am a to string";
    }
    public String getMessage(){
        return super.getMessage() + " i am a getmessage";
    }
}
public class expection1 {
    public static void main(String[] args) {
        int a ;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if (a<100) {
            try {
                extracted();
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
            finally{
                System.out.println("cleaning the resources..... this is end of program");
            }
            scan.close();
        }
    }

    private static void extracted() throws myExeption {
        throw new myExeption();
    }
}
