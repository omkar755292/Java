public class trycatch {
    public static void main(String[] args) {
        int a = 55;
        int b = 0;
        try {
            System.out.println("welcome");
            try {
                int c = a / b;
                System.out.println(c);

            } catch (Exception e) {
                System.out.println("exeception level 2");
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("exeception level 1");
            System.out.println(e);
        }
    }
}
