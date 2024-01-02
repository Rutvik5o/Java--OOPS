interface A 
{
    default void call()
    {
        add(10,20);
    }

    private void add(int x,int y)
    {
        System.out.println("Sum=> "+(x+y));
    }
}

class B implements A
{
    public void sub(int x,int y)
    {
        System.out.println("Sum-> "+(x-y));
    }
}

class xyz6
{
    public static void main(String []args)
    {
        B b=new B();
        b.call();
        b.sub(40,20);
    }
}