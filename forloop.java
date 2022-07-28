public class forloop {
    public static void main(String[] args) {
        for(int i=0; i<=100 ; i++){
            if (i<2) {
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
