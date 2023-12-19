abstract class programming
{
    public abstract void developer();
}

class html extends programming
{
    @Override
    
    public void developer()
    {
        System.out.println("Tim Berner Lee");
    }
}

class java extends programming
{
    @Override
    
    public void developer()
    {
        System.out.println("James Gosling");
    }
}


class AbstractMethod
{
    public static void main(String []args)
    {
        programming Obj=new html(); //abstract class in can give referance or also can that class reference

        Obj.developer();

        java Obj1=new java();

        Obj1.developer();
    }
}