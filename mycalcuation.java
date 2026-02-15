import java.io.*.;
class calculate
{
int z;
public void addition(int x,int y)
{
z=x+y;
system.out.println("sum=",+z);
}
public void substrction(int x,int y)
{
z=x+y;
system.out.println("difference=",+z);
}
public void multipilication(int x,int y)
{
z=x+y;
system.out.println("product=",+z);
}
public void division(int x,int y)
{
z=x+y;
system.out.println("quotient=",+z);
}
}
 public class mycalcuation extends calculate
{
public static void main(string arg[])throws ioexception
{
inta,b;
mycalcuation calc=new mycalcuation
datainputstream.d=new datainputstream(system.in)
system.out.println("enter two number");
a=integer.parseint(d.readline())
b=integer.parseint(d.readLine())
calc.addtion(a,b)
calc.substrction(a,b)
calc.multipilication(a,b)
calc.division(a,b)
}
}

