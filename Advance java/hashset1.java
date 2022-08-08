import java.util.HashSet;

public class hashset1 {
    public static void main(String[] args) {
        HashSet <Integer> sh1 =new HashSet<>();
        sh1.add(5);
        sh1.add(53);
        sh1.add(7);
        sh1.add(53);
        sh1.add(56);
        System.out.println(sh1.clone());
    }
}
