import java.util.LinkedList;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList <Integer> li = new LinkedList<>();
        LinkedList <Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(12);
        l2.addLast(60);
        l2.add(16);
        li.add(5);
        li.add(8);
        li.add(2);
        li.add(6);
        li.add(2,6);
        li.addAll(l2);
        li.addFirst(88);
        for (int i = 0; i < li.size(); i++) {
            System.out.print(" "+li.get(i)+" ");
        }
        System.out.println(li.contains(5));
    }
}
