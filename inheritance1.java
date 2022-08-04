/**
 * phone
 */
class claculator {
    public void calculater(){
        System.out.println("this is a calculater");
    }
}
/**
 * Smartphone
 */
class phone extends claculator {
    public void camera() {
        System.out.println("this is a camera");
    }
    public void calling() {
        System.out.println("calling...");
    }
    public void calculater() {
        System.out.println("this is a calculater of smartphone");
    }
    
}
/**
 * Smartphone2
 */
class Smartphone extends phone{
    public void calculater() {
        System.out.println("this is calculate of smart phone 2");
    }
    public void gaming() {
        System.out.println("game start");
    }
}
public class inheritance1 {
    public static void main(String[] args) {
        Smartphone omkar = new Smartphone();
        omkar.calculater();
        omkar.camera();
        omkar.calling();
        Smartphone vaibhav = new Smartphone();
        vaibhav.calculater();
        vaibhav.gaming();
        vaibhav.calling();
        vaibhav.camera();
    }
}
