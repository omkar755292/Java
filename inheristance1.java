interface camera {
    public void click();
    public void zoomIn();
    public void zoomOut();
}
interface phone{
    public void call();
    public void receive();
    public void reject();
}
interface calculator{
    public void add();
    public void subtract();
    public void multiply();
    public void divide();
}
class smartPhone implements camera, phone{
    @Override
    public void click(){
        System.out.println("click");
    }
    @Override
    public void zoomIn(){
        System.out.println("zoom in");
    }
    @Override
    public void zoomOut(){
        System.out.println("zoom out");
    }
    @Override
    public void call(){
        System.out.println("calling...");
    }
    @Override
    public void receive(){
        System.out.println("pickup");
    }
    @Override
    public void reject(){
        System.out.println("reject");
    }
}
public class inheristance1 {
    public static void main(String[] args) {
        camera c = new smartPhone();
        phone p = new smartPhone();
        c.click();
        // c.call();
        p.call();
        p.receive();
        smartPhone s = new smartPhone();
        s.click();
        s.call();
        s.receive();
    }
}
