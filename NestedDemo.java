class Outer {

    class Inner {

        void display() {
            System.out.println("This is inner class");
        }
    }
}

public class NestedDemo {

    public static void main(String args[]) {

        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();

        in.display();
    }
}
