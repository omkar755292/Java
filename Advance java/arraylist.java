import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> li = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>();
        l2.add(15);
        l2.add(18);
        l2.add(12);
        l2.add(16);
        li.add(5);
        li.add(8);
        li.add(2);
        li.add(6);
        li.add(2,6);
        li.addAll(l2);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
        System.out.println(li.contains(5));
    }
}