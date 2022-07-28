public class trycatch1 {
    public static void main(String[] args) {
        int [] mark = {1,2,6,9};
        mark [2]=35;
        try {
            
            System.out.println(mark[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
        // for illetrate the array
        for(int i =0;i<mark.length;i++){
            System.out.println(mark[i]);
        }
    }
}
