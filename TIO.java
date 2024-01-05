interface shape
{
    final double pi=3.14;
    double area(int side);
}

class printShape
{
    void display(String s)
    {
        System.out.println("Name of the shape=> "+s);
    }
}

class Circle extends printShape implements shape
{
    public double area(int r)
    {
        return(pi*r*r);
    }
}

class square extends printShape implements shape
{
    public double area(int side)
    {
        return(side*side);
    }
}

class TIO
{
    public static void main(String []args)
    {
        Circle Obj=new Circle();
        Obj.display("Circle");
        System.out.println("The area of the circle is=> "+Obj.area(5));

        square Obj1=new square();
        Obj1.display("Square");
        System.out.println("The area of the square is=> "+Obj1.area(5));

    }
}