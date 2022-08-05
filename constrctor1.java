class employee {
    private int id;
    private String name;
    public void employee1(int myid , String myname) {
        id = myid;
        name =myname ;
        System.out.println(id);
        System.out.println(name);
    }
    public void employee1() {
        id = 2;
        name ="vaibhav";
        System.out.println(id);
        System.out.println(name);
    }
    
    
}
public class constrctor1 {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.employee1();
        e1.employee1(1,"omakr");
    }
}
