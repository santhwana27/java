public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add int: " + calc.add(5, 10));
        System.out.println("Add double: " + calc.add(5.5, 2.3));
        System.out.println("Add three ints: " + calc.add(2, 4, 6));
    }
}
