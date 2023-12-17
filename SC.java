class A
{

    A()
    {
        System.out.println("Base Class");
    }
}

class B extends A
{
    B()
    {
        super();  //by default it also called
        System.out.println("Derive Class");
    }
}

class SC
{
    public static void main(String []args)
    {
        B Obj=new B();
    }
}