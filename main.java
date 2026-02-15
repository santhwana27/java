import java.io.*;
interface vehicle
{
public void display();
}
class car implements vehicle
{
public void display()
{
System.out.println("from car class");
}
}
class jeep implements vehicle
{
public void display()
{
System.out.println("from jeep class");
}
}
class main
{
public static void main(String args[])
{
vehicle c1=new car();
vehicle j1=new jeep();
c1.display();
j1.display();
}
}


