abstract class base{
    public void method1(){
        System.out.println("this is method1");
    }
    public abstract void method2(int a);
}    
class subClass extends base{
    public void method2(int a) {
        System.out.println("this is overide");
    }
}
public class abstract1 {
    public static void main(String[] args) {
        base b = new subClass();
        b.method2(5);
    }
}
