import java.io.*;
class x implements Runnable
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("\t Thread X"+i);
{
System.out.println("end of thread");
}
}
class RunnableTest
{
public static void main(string arg[])
{
X runnable=new X();
Thread threadX=new Thread(runnable);
threadX.start();
System.out.println("end of main thread");
}
}