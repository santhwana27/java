class This
{
    String name;
    int rollno;

    This(String name, int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }

    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Rollno : " + rollno);
    }
}

public class Thiskey
{
    public static void main(String args[])
    {
        This t = new This("Santhwana", 26);
        t.display();
    }
}
