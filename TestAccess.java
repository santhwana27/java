 class AccessDemo {

    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;   

    public void show() {
        System.out.println("Private Variable: " + privateVar);
    }
}

public class TestAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);

        obj.show();  
    }
}
