public class method1 {

    static int sum(int ...arr) {
        int result =0;
        for (int i : arr) {
            result +=i;
        }
        System.out.println(result);
        return result;
    }
    // static int sum(int x , int y, int w) {
    //     int z = x + y+w;
    //     return z;
    // }
    public static void main(String[] args) {
        
        sum();
        sum(2,9);
        sum(5,92,6,7);

    }
}