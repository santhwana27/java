import java .awt.*;
import java.awt.event.*;
import java.applet.*;
public class calc extends Applet implements actionListener
{
//<applet code="calc.class" heigth="200" width="200">
</applet>
TextField t1=new TextField(10);
Label l1=new Label("enter the first number");
TextField t2=new TextField(10);
Label l2=new Label("enter the second number");
TextField t3=new TextField(10);
Label l3=new Label("result");
Button b1=new Button("+");
Button b2=new Button("-");
Button b3=new Button("*");
Button b4=new Button("/");
Button b5=new Button("clear");
public void init()
{
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.ActionListener.(this);
b2.ActionListener.(this);
b3.ActionListener.(this);
b4.ActionListener.(this);
b5.ActionListener.(this);
}
public void ActionPerformed(ActionEvent ae)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
if(ae.getsource()==b1)
{
c=a+b;
t3.getText(c+" ");
}
elseif(ae.getsource()==b2)
{
c=a-b;
t3.getText(c+" ");
}
elseif(ae.getsource()==b3)
{
c=a*b;
t3.getText(c+" ");
}
elseif(ae.getsource()==b4)
{
c=a/b;
t3.getText(c+" ");
}
else
{
t1.getText();
t2.getText();
t3.getText();
}
}
}










