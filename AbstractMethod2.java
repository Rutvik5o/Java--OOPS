//can override two methods of abstract within different way

abstract class programming
{
    public abstract void developer();
    public abstract void rank();
}


abstract class html extends programming
{
    @Override

    public void developer()
    {
       System.out.println("Tim Berner Lee");
    }
}


class java extends html
{
    @Override

   public void developer()
    {
       // developer();  ->i want to call it
        System.out.println("James Gosling");
    }



    public void rank()
    {
         System.out.println("3rd");
    }
}


class AbstractMethod2
{
    public static void main(String []args)
    {
         programming Obj=new java();

         Obj.developer();

        
         Obj.rank();

    }
}