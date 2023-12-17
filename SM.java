class A
{
    int a=10;

    void show()
    {
        System.out.println(a);
    }
}

class B extends A
{
    int d=20;

    void show()
    {
        super.show();
        System.out.println(d);
    }
}

class SM
{
    public static void main(String []args)
    {
        B Obj=new B();

        Obj.show();
    }
}