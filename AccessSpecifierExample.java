class AccessDemo {

    public int a = 5;        // public
    private int b = 10;      // private
    protected int c = 15;    // protected
    int d = 20;              // default

    public void show() {
        System.out.println("Private variable b: " + b);
    }
}

public class AccessSpecifierExample {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println("Public variable a: " + obj.a);
        System.out.println("Protected variable c: " + obj.c);
        System.out.println("Default variable d: " + obj.d);

        obj.show();
    }
}
