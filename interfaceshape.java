interface shape
{
    void area();
}

class circle implements shape
{
    public void area()
    {
        System.out.println("area of circle");
    }
}

class interfaceshape
{
    public static void main(String args[])
    {
        circle c = new circle();
        c.area();
    }
}
