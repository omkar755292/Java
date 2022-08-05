interface bicycle{
    void applyBreak();
    void speedUp();
    // void horn();
}
interface hornSound{
    void hornLoud();
    void hornLow();
}
class heroCycle implements bicycle , hornSound{
    public void applyBreak(){
        System.out.println("applying break");
    }
    public void speedUp(){
        System.out.println("speeding up");
    }
    public void horn(){
        System.out.println("peee.....");
    }
    public void hornLoud(){
        System.out.println("loud peeee.................");
    }
    public void hornLow(){
        System.out.println("low pee..");
    }
}
public class interface1 {
    public static void main(String[] args) {
        heroCycle omkar = new heroCycle();
        omkar.applyBreak();
        omkar.horn();
        omkar.hornLoud();
        omkar.hornLow();
    }
}
