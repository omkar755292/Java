import java.util.ArrayDeque;

public class arraydeque1 {
    public static void main(String[] args) {
        ArrayDeque <Integer> ad1 =new ArrayDeque<>();
        ad1.add(6);
        ad1.addLast(65);
        ad1.add(3);
        ad1.add(4);
        ad1.add(1);
        ad1.addFirst(22);
        ad1.add(8);
        ad1.addFirst(32);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }

}
