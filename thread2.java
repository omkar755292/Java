class mythread1 implements Runnable{
    public void run(){
       while(true){
           System.out.println("tread 11111");
        }
    }
}
class mythread2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("tread 22222");
        }
    }
}
public class thread2 {
    public static void main(String[] args) {

        mythread1 bullet1 = new mythread1();
        Thread gun1 = new Thread(bullet1);
        mythread2 bullet2 = new mythread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
