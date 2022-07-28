public class recursion1 {
    public static int factorial(int n) {
        if (n==0||n==1) {
            return 1;
        }
         else {
            int result = 1;
            for (int i = 1; i <=n ; i++) {
                result *= i;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        int x =4;
        System.out.println("the value of factorial : "+factorial(x));
    }
}
