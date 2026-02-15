import java.io.*;

interface Area {
    float pi = 3.14f;
    float compute(float x, float y);
}

class Rectangle implements Area {
    public float compute(float x, float y) {
        return x * y;
    }
}

class Circle implements Area {
    public float compute(float x, float y) {
        return pi * x * x;
    }
}

public class InterfaceDemo 
{
    public static void main(String[] args) throws IOException
 {
        DataInputStream br=new  DataInputStream(System.in);
        
        System.out.print("Enter length and width of rectangle: ");
        float l = Float.parseFloat(br.readLine());
        float b = Float.parseFloat(br.readLine());
        System.out.println("Area of rectangle: " + new Rectangle().compute(l, b));

        System.out.print("Enter radius of the circle: ");
        float r = Float.parseFloat(br.readLine());
        System.out.println("Area of circle: " + new Circle().compute(r, 0));
    }
}
