package arrays;

public class array1 {
    public static void main(String[] args) {
        int [] mark = {1,2,6,9};
        mark [2]=35;
        System.out.println(mark[2]);
        // for illetrate the array
        for(int i =0;i<mark.length;i++){
            System.out.println(mark[i]);
        }
        // for illetrate the array using foreach loop
        for (int j : mark) {
            System.out.println(j);
        }
    }
}
