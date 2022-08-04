class ekClass {
    int a;

    public void ekClass1(int n){
        this.a =  n;
        System.out.println(a);
    }
    
}
public class This1 {

    public static void main(String[] args){
        ekClass a = new ekClass();
        a.ekClass1(5);

        
    }
}