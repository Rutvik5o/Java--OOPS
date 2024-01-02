 interface A 
{
    public static void call()
    {
        add(10,20);
    
    }

    private static void add(int x,int y)
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

class xyz6i
{
    public static void main(String []args)
    {
        B b=new B();
        A.call();
        b.sub(10,20);
    }
} 
    

